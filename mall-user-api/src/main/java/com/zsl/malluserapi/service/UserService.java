package com.zsl.malluserapi.service;

import com.zsl.malluserapi.dto.user.in.UserLoginParam;
import com.zsl.malluserapi.dto.user.in.UserRegisterParam;
import com.zsl.malluserapi.dto.user.in.UserUpdateParam;
import com.zsl.malluserdb.po.UserMember;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    /**
     * 用户注册(自主注册)
     * @param registerParam
     * @return
     */
    int register(UserRegisterParam registerParam);

    /**
     * 分享注册
     * @param shareId
     * @param registerParam
     * @return
     */
    int shareRegister(String shareId,UserRegisterParam registerParam,HttpServletRequest request);


    /**
     * 根据手机号判断用户是否存在
     * @param phone
     * @return
     */
    boolean isUserExistByPhone(String phone);

    /**
     * 用户登录
     * @param loginParam
     * @return
     */
    int login(UserLoginParam loginParam);

    /**
     * 密码重置
     * @param registerParam
     * @return
     */
    int reset(UserRegisterParam registerParam);

    /**
     * 获取用户详情
     * @param userId
     * @return
     */
    UserMember userDetail(Integer userId);

    /**
     * 用户信息修改
     * @param updateParam
     * @return
     */
    int update(UserUpdateParam updateParam);

    /**
     * 移动朋友
     * @param moveUserId
     * @param targetUserId
     * @return
     */
    int moveFriend(Integer moveUserId,Integer targetUserId);



}
