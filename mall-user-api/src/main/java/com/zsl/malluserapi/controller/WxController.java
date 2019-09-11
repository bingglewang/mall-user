package com.zsl.malluserapi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zsl.malluserapi.dto.user.in.UserRegisterParam;
import com.zsl.malluserapi.dto.wx.in.WebUrlParam;
import com.zsl.malluserapi.service.UserService;
import com.zsl.malluserapi.service.WxService;
import com.zsl.malluserapi.util.DigestUtil;
import com.zsl.malluserapi.util.HttpClientUtil;
import com.zsl.mallusercommon.CommonResult;
import com.zsl.malluserdb.mapper.UserMemberMapper;
import com.zsl.malluserdb.mapper.UserWeixinMapper;
import com.zsl.malluserdb.po.UserMember;
import com.zsl.malluserdb.po.UserMemberExample;
import com.zsl.malluserdb.po.UserWeixin;
import com.zsl.malluserdb.po.UserWeixinExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.ResponseWrapper;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("wx")
public class WxController {

    @Autowired
    private WxService wxService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserWeixinMapper userWeixinMapper;

    @Autowired
    private UserMemberMapper userMemberMapper;

    @Value("${weixin.appID}")
    private String appID;

    @Value("${weixin.appsecret}")
    private String appsecret;

    @PostMapping("getSignature")
    public Object getSignature(@RequestBody WebUrlParam webUrl){
        return wxService.createSignature(webUrl.getWebUrl());
    }

    /**
     * 绑定用户手机号
     * @return
     */
    @RequestMapping("/bindUserPhone")
    public CommonResult bindUserPhone(HttpServletRequest request){
        String openid = request.getParameter("openid");
        String phone = request.getParameter("phone");
        String shareLinkId = request.getParameter("shareId");
        //根据手机号查询用户表里面有没有
        UserMemberExample userMemberExample = new UserMemberExample();
        UserMemberExample.Criteria criteria = userMemberExample.createCriteria();
        criteria.andMobileEqualTo(phone);
        List<UserMember> userMemberList = userMemberMapper.selectByExample(userMemberExample);
        UserMember userMember = new UserMember();
        int i = -1;
        if(CollectionUtils.isEmpty(userMemberList)){
            if(!StringUtils.isNotBlank(shareLinkId) || "undefined".equals(shareLinkId)) {
                userMember.setOpenId(openid);
                userMember.setMobile(phone);
                UserWeixinExample userWeixinExample = new UserWeixinExample();
                UserWeixinExample.Criteria criteria1 = userWeixinExample.createCriteria();
                criteria1.andWxOpenidEqualTo(openid);
                List<UserWeixin> userWeixinList = userWeixinMapper.selectByExample(userWeixinExample);
                if (!(CollectionUtils.isEmpty(userWeixinList))) {
                    userMember.setPicUrl(userWeixinList.get(0).getWxHeadimage());
                    userMember.setCity(userWeixinList.get(0).getWxCity());
                    userMember.setNickname(userWeixinList.get(0).getWxNickname());
                    userMember.setCountry(userWeixinList.get(0).getWxCountry());
                    userMember.setProvince(userWeixinList.get(0).getWxProvince());
                    userMember.setSex(userWeixinList.get(0).getWxSex());
                }
                //密码加密处理
                userMember.setPassword(DigestUtil.md5Degist("zs123456"));
                //生成分享码
                String shareid = UUID.randomUUID() + "";
                shareid = shareid.replace("-", "");
                userMember.setShareId(shareid);
                i = userMemberMapper.insertSelective(userMember);
            }else{
                UserRegisterParam userRegisterParam = new UserRegisterParam();
                userRegisterParam.setMobile(phone);
                userRegisterParam.setPassword("zs123456");
                i = userService.shareRegister(shareLinkId, userRegisterParam,request);
            }
        }else{
            if(StringUtils.isNoneBlank(userMemberList.get(0).getOpenId())){
                return CommonResult.failed("该手机号已被绑定");
            }
            userMember.setId(userMemberList.get(0).getId());
            userMember.setOpenId(openid);
            i = userMemberMapper.updateByPrimaryKeySelective(userMember);
        }
        if(i > 0){
            //查看绑定信息
            UserMemberExample userMemberExample1 = new UserMemberExample();
            UserMemberExample.Criteria criteria1 = userMemberExample1.createCriteria();
            criteria1.andOpenIdEqualTo(openid);
            List<UserMember> userMemberList1 = userMemberMapper.selectByExample(userMemberExample1);
            if(!(CollectionUtils.isEmpty(userMemberList1)))
              return CommonResult.success(userMemberList1.get(0),"绑定成功");
            return CommonResult.failed("绑定失败");
        }else{
            return CommonResult.failed("绑定失败");
        }
    }

    /**
     * 拼接公众号用户授权地址，并回传给前端
     * params callbackUrl 前端回调地址
     * @return
     */
    @PostMapping("/wxAuth/login")
    public String wxLogin(@RequestBody  String accessurl) throws IOException {
        //请求获取code的回调地址
        //用线上环境的域名或者用内网穿透，不能用ip
       // String callBack = "http://mall-beta.cntracechain.com/mallUser/wx/wxAuth/callBack";
        JSONObject jsonObject = JSONObject.parseObject(accessurl);
        String callBack = jsonObject.getString("accessurl");
        //请求地址
        String url = "https://open.weixin.qq.com/connect/oauth2/authorize" +
                "?appid=" + appID +
                "&redirect_uri=" + URLEncoder.encode(callBack)+
                "&response_type=code" +
                "&scope=snsapi_userinfo" +
                "&state=STATE#wechat_redirect";
        //重定向

        return url;
    }

    //	回调方法
    @RequestMapping("/wxAuth/callBack")
    public CommonResult wxCallBack(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String code = request.getParameter("code");

        //获取refresh_token
        String url1 = "https://api.weixin.qq.com/sns/oauth2/refresh_token" +
                "?appid=" + appID +
                "&code=" + code +
                "&grant_type=authorization_code";
        String result1 = HttpClientUtil.doGet(url1);
        //返回结果的json对象
        //返回结果的json对象
        JSONObject resultObject = null;

        JSONObject resultObject1 = JSON.parseObject(result1);
        if(resultObject1.getString("access_token") != null && resultObject1.getString("access_token") != ""){
            resultObject = resultObject1;
        }else{
            //获取access_token
            String url = "https://api.weixin.qq.com/sns/oauth2/access_token" +
                    "?appid=" + appID +
                    "&secret=" + appsecret +
                    "&code=" + code +
                    "&grant_type=authorization_code";

            String result = HttpClientUtil.doGet(url);

            System.out.println("请求获取access_token:" + result);
            //返回结果的json对象
            resultObject = JSON.parseObject(result);
        }


        //请求获取userInfo
        String infoUrl = "https://api.weixin.qq.com/sns/userinfo" +
                "?access_token=" + resultObject.getString("access_token") +
                "&openid=" + resultObject.getString("openid") +
                "&lang=zh_CN";

        String resultInfo = HttpClientUtil.doGet(infoUrl);

        //此时已获取到userInfo，再根据业务进行处理
        System.out.println("请求获取userInfo:" + resultInfo);

        JSONObject resultData = null;
        try{
            resultData = JSON.parseObject(resultInfo);
        }catch (Exception e){

        }

        if(resultData.getString("openid") != null && resultData.getString("openid") != ""){
            String wx_openid = resultData.getString("openid");
            String wx_country = resultData.getString("country");
            String wx_province = resultData.getString("province");
            String wx_city = resultData.getString("city");
            String wx_nickname = resultData.getString("nickname");
            String wx_headimage = resultData.getString("headimgurl");
            String wx_sex = resultData.getString("sex");
            UserWeixinExample userWeixinExample = new UserWeixinExample();
            UserWeixinExample.Criteria criteria = userWeixinExample.createCriteria();
            criteria.andWxOpenidEqualTo(wx_openid);
            List<UserWeixin> userWeixinList = userWeixinMapper.selectByExample(userWeixinExample);
            if(CollectionUtils.isEmpty(userWeixinList)){
                UserWeixin userWeixin = new UserWeixin();
                userWeixin.setWxCity(wx_city);
                userWeixin.setWxCountry(wx_country);
                userWeixin.setWxHeadimage(wx_headimage);
                userWeixin.setWxSex(wx_sex);
                userWeixin.setWxNickname(wx_nickname);
                userWeixin.setWxProvince(wx_province);
                userWeixin.setWxOpenid(wx_openid);
                userWeixinMapper.insert(userWeixin);
            }
            //查看绑定信息
            UserMemberExample userMemberExample = new UserMemberExample();
            UserMemberExample.Criteria criteria1 = userMemberExample.createCriteria();
            criteria1.andOpenIdEqualTo(wx_openid);
            List<UserMember> userMemberList = userMemberMapper.selectByExample(userMemberExample);
            Map result_user = new HashMap();
            if(CollectionUtils.isEmpty(userMemberList)){
                //没有绑定
                result_user.put("bindstatus",1);
                result_user.put("userInfo",null);
                result_user.put("openid",wx_openid);
                return CommonResult.success(result_user);
            }else{
                //绑定
                result_user.put("bindstatus",0);
                result_user.put("userInfo",userMemberList.get(0));
                return CommonResult.success(result_user);
            }
        }
        return CommonResult.success(resultData);
    }
}
