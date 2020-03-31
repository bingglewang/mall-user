package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorMemberFriend;
import com.zsl.malluserdb.po.SuperiorMemberFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorMemberFriendMapper {
    long countByExample(SuperiorMemberFriendExample example);

    int deleteByExample(SuperiorMemberFriendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorMemberFriend record);

    int insertSelective(SuperiorMemberFriend record);

    SuperiorMemberFriend selectOneByExample(SuperiorMemberFriendExample example);

    SuperiorMemberFriend selectOneByExampleSelective(@Param("example") SuperiorMemberFriendExample example, @Param("selective") SuperiorMemberFriend.Column ... selective);

    SuperiorMemberFriend selectOneByExampleWithBLOBs(SuperiorMemberFriendExample example);

    List<SuperiorMemberFriend> selectByExampleSelective(@Param("example") SuperiorMemberFriendExample example, @Param("selective") SuperiorMemberFriend.Column ... selective);

    List<SuperiorMemberFriend> selectByExampleWithBLOBs(SuperiorMemberFriendExample example);

    List<SuperiorMemberFriend> selectByExample(SuperiorMemberFriendExample example);

    SuperiorMemberFriend selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorMemberFriend.Column ... selective);

    SuperiorMemberFriend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorMemberFriend record, @Param("example") SuperiorMemberFriendExample example);

    int updateByExampleWithBLOBs(@Param("record") SuperiorMemberFriend record, @Param("example") SuperiorMemberFriendExample example);

    int updateByExample(@Param("record") SuperiorMemberFriend record, @Param("example") SuperiorMemberFriendExample example);

    int updateByPrimaryKeySelective(SuperiorMemberFriend record);

    int updateByPrimaryKeyWithBLOBs(SuperiorMemberFriend record);

    int updateByPrimaryKey(SuperiorMemberFriend record);
}