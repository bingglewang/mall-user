package com.zsl.malluserapi.dto.user.in;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserUpdateParam {
    private Integer id;        //用户id
    private String loginName;  //用户名
    private String password;   //密码
    private String realname;   //真实姓名
    private String nickname;   //昵称
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date brithday;     //生日
    private String picUrl;     //头像

    private String openId;
    private String mobile;
    private String sex;
    private String province;
    private String city;
    private String country;
}
