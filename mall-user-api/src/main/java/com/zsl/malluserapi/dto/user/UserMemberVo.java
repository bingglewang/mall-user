package com.zsl.malluserapi.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName UserMemberVo
 * @Description 会员登录返回实体类
 * @Author binggleW
 * @Date 2019-08-09 10:00
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMemberVo{
    /**
     * 会员等级
     */
    private Integer rank;
    private Integer id;

    private String loginName;

    private String openId;

    private String realname;

    private String nickname;

    private Date brithday;

    private String picUrl;

    private String mobile;

    private Date cteateTime;

    private Date lastLoginTime;

    private String shareId;

    private Long totalPoint;

    private String sex;

    private String province;

    private String city;

    private String country;

    private Double balance;

    private Integer node;
}
