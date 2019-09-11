package com.zsl.malluserapi.dto.user;

import com.zsl.malluserdb.po.UserMember;
import lombok.Data;

/**
 * @ClassName UserMemberVo
 * @Description 会员登录返回实体类
 * @Author binggleW
 * @Date 2019-08-09 10:00
 * @Version 1.0
 **/
@Data
public class UserMemberVo extends UserMember {
    private Integer rank; //会员等级
}
