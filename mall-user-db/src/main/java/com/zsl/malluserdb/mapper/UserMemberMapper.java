package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserMember;
import com.zsl.malluserdb.po.UserMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMemberMapper {
    long countByExample(UserMemberExample example);

    int deleteByExample(UserMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserMember record);

    int insertSelective(UserMember record);

    UserMember selectOneByExample(UserMemberExample example);

    UserMember selectOneByExampleSelective(@Param("example") UserMemberExample example, @Param("selective") UserMember.Column ... selective);

    List<UserMember> selectByExampleSelective(@Param("example") UserMemberExample example, @Param("selective") UserMember.Column ... selective);

    List<UserMember> selectByExample(UserMemberExample example);

    UserMember selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") UserMember.Column ... selective);

    UserMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserMember record, @Param("example") UserMemberExample example);

    int updateByExample(@Param("record") UserMember record, @Param("example") UserMemberExample example);

    int updateByPrimaryKeySelective(UserMember record);

    int updateByPrimaryKey(UserMember record);
}