package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.InteractionInstantce;
import com.zsl.malluserdb.po.InteractionInstantceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteractionInstantceMapper {
    long countByExample(InteractionInstantceExample example);

    int deleteByExample(InteractionInstantceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InteractionInstantce record);

    int insertSelective(InteractionInstantce record);

    InteractionInstantce selectOneByExample(InteractionInstantceExample example);

    InteractionInstantce selectOneByExampleSelective(@Param("example") InteractionInstantceExample example, @Param("selective") InteractionInstantce.Column ... selective);

    List<InteractionInstantce> selectByExampleSelective(@Param("example") InteractionInstantceExample example, @Param("selective") InteractionInstantce.Column ... selective);

    List<InteractionInstantce> selectByExample(InteractionInstantceExample example);

    InteractionInstantce selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") InteractionInstantce.Column ... selective);

    InteractionInstantce selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InteractionInstantce record, @Param("example") InteractionInstantceExample example);

    int updateByExample(@Param("record") InteractionInstantce record, @Param("example") InteractionInstantceExample example);

    int updateByPrimaryKeySelective(InteractionInstantce record);

    int updateByPrimaryKey(InteractionInstantce record);
}