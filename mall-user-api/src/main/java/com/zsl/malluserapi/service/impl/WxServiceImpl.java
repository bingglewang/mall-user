package com.zsl.malluserapi.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zsl.malluserapi.service.WxService;
import com.zsl.malluserapi.util.HttpUtil;
import com.zsl.malluserapi.util.Sign;
import com.zsl.mallusercommon.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WxServiceImpl implements WxService {

    @Value("${weixin.appID}")
    private String appID;

    @Value("${weixin.appsecret}")
    private String appsecret;

    /*@Value("${weixin.webUrl}")
    private String webUrl;
*/
    @Value("${weixin.accessUrl}")
    private String accessUrl;

    @Value("${weixin.grantType}")
    private String grantType;

    @Value("${weixin.jsapiTicket}")
    private String jsapi_ticket;

    @Override
    public Object createSignature(String webUrl) {
        //获取access_token 接口
        String ACCESS_TOKEN_URL = accessUrl
                + "?grant_type="+grantType+"&appid="+appID+"&secret="+appsecret;
        JSONObject result = HttpUtil.doGetstr(ACCESS_TOKEN_URL);
        if(result != null){
            String url = jsapi_ticket+"?access_token="+result.get("access_token")+"&type=jsapi";
            JSONObject result1 = HttpUtil.doGetstr(url);
            if(result1 != null){
                Map<String, String> ret = Sign.sign(result1.get("ticket")+"", webUrl);
                ret.put("appId",appID);
                return CommonResult.success(ret);
            }
        }
        return result;
    }
}
