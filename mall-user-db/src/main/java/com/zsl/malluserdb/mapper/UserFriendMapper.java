package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserFriend;
import com.zsl.malluserdb.po.UserFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFriendMapper {
    long countByExample(UserFriendExample example);

    int deleteByExample(UserFriendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFriend record);

    int insertSelective(UserFriend record);

    UserFriend selectOneByExample(UserFriendExample example);

    UserFriend selectOneByExampleSelective(@Param("example") UserFriendExample example, @Param("selective") UserFriend.Column ... selective);

    UserFriend selectOneByExampleWithBLOBs(UserFriendExample example);

    List<UserFriend> selectByExampleSelective(@Param("example") UserFriendExample example, @Param("selective") UserFriend.Column ... selective);

    List<UserFriend> selectByExampleWithBLOBs(UserFriendExample example);

    List<UserFriend> selectByExample(UserFriendExample example);

    UserFriend selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") UserFriend.Column ... selective);

    UserFriend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFriend record, @Param("example") UserFriendExample example);

    int updateByExampleWithBLOBs(@Param("record") UserFriend record, @Param("example") UserFriendExample example);

    int updateByExample(@Param("record") UserFriend record, @Param("example") UserFriendExample example);

    int updateByPrimaryKeySelective(UserFriend record);

    int updateByPrimaryKeyWithBLOBs(UserFriend record);

    int updateByPrimaryKey(UserFriend record);
}