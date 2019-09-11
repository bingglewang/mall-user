package com.zsl.malluserapi.dto.user.in;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserLoginParam {
    @NotEmpty(message = "手机号码不能为空")
    private String mobile; //手机号码
    @NotEmpty(message = "密码不能为空")
    private String password; //密码
}
