package com.zsl.malluserapi.controller;

import com.zsl.malluserapi.dao.UserDao;
import com.zsl.malluserapi.dto.user.UserMemberVo;
import com.zsl.malluserapi.dto.user.in.UserLoginParam;
import com.zsl.malluserapi.dto.user.in.UserRegisterParam;
import com.zsl.malluserapi.dto.user.in.UserUpdateParam;
import com.zsl.malluserapi.service.UserService;
import com.zsl.mallusercommon.CommonResult;
import com.zsl.malluserdb.mapper.UserMemberMapper;
import com.zsl.malluserdb.po.UserMember;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@RestController
@RequestMapping("user")
public class UserMemberController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMemberMapper userMemberMapper;

    @Autowired
    private UserDao userDao;

    /**
     * 用户注册
     *
     * @param userRegisterParam
     * @param result
     * @return
     */
    @PostMapping("register")
    public CommonResult register(@RequestBody @Valid UserRegisterParam userRegisterParam, BindingResult result) {
        int i = userService.register(userRegisterParam);
        if (i == -1) {
            return CommonResult.failed("该手机号已经被注册");
        } else if (i == -2) {
            return CommonResult.failed("验证码错误");
        } else if (i == -3) {
            return CommonResult.failed("插入失败");
        } else {
            return CommonResult.success("注册成功");
        }
    }

    /**
     * 用户注册（分享）
     *
     * @param userRegisterParam
     * @param result
     * @return
     */
    @PostMapping("shareRegister")
    public CommonResult shareRegister(@NotEmpty(message = "分享码不能为空") String shareId, @RequestBody @Valid UserRegisterParam userRegisterParam,HttpServletRequest request, BindingResult result) {
        int i = userService.shareRegister(shareId, userRegisterParam,request);
        if (i == -1) {
            return CommonResult.failed("该手机号已经被注册");
        } else if (i == -2) {
            return CommonResult.failed("验证码错误");
        } else if (i == -3) {
            return CommonResult.failed("分享人不存在");
        } else if (i == -4) {
            return CommonResult.failed("插入失败");
        } else if (i == -5) {
            return CommonResult.failed("朋友插入失败");
        }else if(i == -6){
            return CommonResult.failed("该微信已经注册和绑定");
        }else {
            return CommonResult.success("注册成功");
        }

    }

    /**
     * 用户登录
     *
     * @param loginParam
     * @param result
     * @return
     */
    @PostMapping("login")
    public CommonResult login(@RequestBody @Valid UserLoginParam loginParam, BindingResult result) {
        int i = userService.login(loginParam);
        if (i == -1) {
            return CommonResult.failed("该手机号还没注册");
        } else if (i == -2) {
            return CommonResult.failed("密码错误");
        }else{
            UserMember userMember = userMemberMapper.selectByPrimaryKey(i);
            UserMemberVo loginUser = new UserMemberVo();
            BeanUtils.copyProperties(userMember,loginUser);
            Integer rank = userDao.selectSuperiorByUserId(userMember.getId());
            if(rank == null){
                rank = 0;
            }
            loginUser.setRank(rank);
            return CommonResult.success(loginUser, "登录成功");
        }
    }

    /**
     * 密码重置
     *
     * @param userRegisterParam
     * @param result
     * @return
     */
    @PostMapping("reset")
    public CommonResult reset(@RequestBody @Valid UserRegisterParam userRegisterParam, BindingResult result) {
        int i = userService.reset(userRegisterParam);
        if (i == -1) {
            return CommonResult.failed("用户不存在");
        } else if (i == -2) {
            return CommonResult.failed("验证码错误");
        } else if (i == -3) {
            return CommonResult.failed("密码重置失败");
        } else {
            return CommonResult.success("密码重置成功");
        }
    }

    /**
     * 用户详情
     * @param userId
     * @return
     */
    @GetMapping("userDetail")
    public CommonResult userDetail(Integer userId){
        return CommonResult.success(userService.userDetail(userId));
    }

    @PostMapping("update")
    public CommonResult update(@RequestBody UserUpdateParam userUpdateParam){
        int i = userService.update(userUpdateParam);
        if(i < 0){
            return CommonResult.failed("修改失败");
        }else{
            return CommonResult.success("修改成功");
        }
    }

    @GetMapping("moveFriend")
    public CommonResult moveFriend(Integer moveUserId, Integer targetUserId){
        int i = userService.moveFriend(moveUserId,targetUserId);
        if(i == -1){
            return CommonResult.failed("移动用户不存在");
        }else{
            return CommonResult.success("修改成功");
        }
    }

}
