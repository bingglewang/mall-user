package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserPoint;
import com.zsl.malluserdb.po.UserPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointMapper {
    long countByExample(UserPointExample example);

    int deleteByExample(UserPointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPoint record);

    int insertSelective(UserPoint record);

    UserPoint selectOneByExample(UserPointExample example);

    UserPoint selectOneByExampleSelective(@Param("example") UserPointExample example, @Param("selective") UserPoint.Column ... selective);

    List<UserPoint> selectByExampleSelective(@Param("example") UserPointExample example, @Param("selective") UserPoint.Column ... selective);

    List<UserPoint> selectByExample(UserPointExample example);

    UserPoint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") UserPoint.Column ... selective);

    UserPoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPoint record, @Param("example") UserPointExample example);

    int updateByExample(@Param("record") UserPoint record, @Param("example") UserPointExample example);

    int updateByPrimaryKeySelective(UserPoint record);

    int updateByPrimaryKey(UserPoint record);
}