package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserWeixin;
import com.zsl.malluserdb.po.UserWeixinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeixinMapper {
    long countByExample(UserWeixinExample example);

    int deleteByExample(UserWeixinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWeixin record);

    int insertSelective(UserWeixin record);

    UserWeixin selectOneByExample(UserWeixinExample example);

    UserWeixin selectOneByExampleSelective(@Param("example") UserWeixinExample example, @Param("selective") UserWeixin.Column ... selective);

    List<UserWeixin> selectByExampleSelective(@Param("example") UserWeixinExample example, @Param("selective") UserWeixin.Column ... selective);

    List<UserWeixin> selectByExample(UserWeixinExample example);

    UserWeixin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") UserWeixin.Column ... selective);

    UserWeixin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWeixin record, @Param("example") UserWeixinExample example);

    int updateByExample(@Param("record") UserWeixin record, @Param("example") UserWeixinExample example);

    int updateByPrimaryKeySelective(UserWeixin record);

    int updateByPrimaryKey(UserWeixin record);
}