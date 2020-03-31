package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserWish;
import com.zsl.malluserdb.po.UserWishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWishMapper {
    long countByExample(UserWishExample example);

    int deleteByExample(UserWishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWish record);

    int insertSelective(UserWish record);

    UserWish selectOneByExample(UserWishExample example);

    UserWish selectOneByExampleSelective(@Param("example") UserWishExample example, @Param("selective") UserWish.Column ... selective);

    List<UserWish> selectByExampleSelective(@Param("example") UserWishExample example, @Param("selective") UserWish.Column ... selective);

    List<UserWish> selectByExample(UserWishExample example);

    UserWish selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") UserWish.Column ... selective);

    UserWish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWish record, @Param("example") UserWishExample example);

    int updateByExample(@Param("record") UserWish record, @Param("example") UserWishExample example);

    int updateByPrimaryKeySelective(UserWish record);

    int updateByPrimaryKey(UserWish record);
}