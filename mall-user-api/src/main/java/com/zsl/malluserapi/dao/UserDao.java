package com.zsl.malluserapi.dao;

import com.zsl.malluserdb.po.UserFriend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义Dao
 * Created by wangbinggui on 2019/5/28.
 */
public interface UserDao {
    UserFriend getByFriendId(@Param("friendId") Integer friendId);
    List<UserFriend> getFriendListByTree(@Param("tree") String moveShareId);
    Integer selectSuperiorByUserId(@Param("userId") Integer userId);
}
