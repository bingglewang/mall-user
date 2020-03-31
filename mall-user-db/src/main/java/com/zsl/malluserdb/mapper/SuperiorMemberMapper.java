package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorMember;
import com.zsl.malluserdb.po.SuperiorMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorMemberMapper {
    long countByExample(SuperiorMemberExample example);

    int deleteByExample(SuperiorMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorMember record);

    int insertSelective(SuperiorMember record);

    SuperiorMember selectOneByExample(SuperiorMemberExample example);

    SuperiorMember selectOneByExampleSelective(@Param("example") SuperiorMemberExample example, @Param("selective") SuperiorMember.Column ... selective);

    List<SuperiorMember> selectByExampleSelective(@Param("example") SuperiorMemberExample example, @Param("selective") SuperiorMember.Column ... selective);

    List<SuperiorMember> selectByExample(SuperiorMemberExample example);

    SuperiorMember selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorMember.Column ... selective);

    SuperiorMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorMember record, @Param("example") SuperiorMemberExample example);

    int updateByExample(@Param("record") SuperiorMember record, @Param("example") SuperiorMemberExample example);

    int updateByPrimaryKeySelective(SuperiorMember record);

    int updateByPrimaryKey(SuperiorMember record);
}