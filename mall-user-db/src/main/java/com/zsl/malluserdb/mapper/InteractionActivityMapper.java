package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.InteractionActivity;
import com.zsl.malluserdb.po.InteractionActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteractionActivityMapper {
    long countByExample(InteractionActivityExample example);

    int deleteByExample(InteractionActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InteractionActivity record);

    int insertSelective(InteractionActivity record);

    InteractionActivity selectOneByExample(InteractionActivityExample example);

    InteractionActivity selectOneByExampleSelective(@Param("example") InteractionActivityExample example, @Param("selective") InteractionActivity.Column ... selective);

    InteractionActivity selectOneByExampleWithBLOBs(InteractionActivityExample example);

    List<InteractionActivity> selectByExampleSelective(@Param("example") InteractionActivityExample example, @Param("selective") InteractionActivity.Column ... selective);

    List<InteractionActivity> selectByExampleWithBLOBs(InteractionActivityExample example);

    List<InteractionActivity> selectByExample(InteractionActivityExample example);

    InteractionActivity selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") InteractionActivity.Column ... selective);

    InteractionActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InteractionActivity record, @Param("example") InteractionActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") InteractionActivity record, @Param("example") InteractionActivityExample example);

    int updateByExample(@Param("record") InteractionActivity record, @Param("example") InteractionActivityExample example);

    int updateByPrimaryKeySelective(InteractionActivity record);

    int updateByPrimaryKeyWithBLOBs(InteractionActivity record);

    int updateByPrimaryKey(InteractionActivity record);
}