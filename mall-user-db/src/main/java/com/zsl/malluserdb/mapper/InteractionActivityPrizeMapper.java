package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.InteractionActivityPrize;
import com.zsl.malluserdb.po.InteractionActivityPrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteractionActivityPrizeMapper {
    long countByExample(InteractionActivityPrizeExample example);

    int deleteByExample(InteractionActivityPrizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InteractionActivityPrize record);

    int insertSelective(InteractionActivityPrize record);

    InteractionActivityPrize selectOneByExample(InteractionActivityPrizeExample example);

    InteractionActivityPrize selectOneByExampleSelective(@Param("example") InteractionActivityPrizeExample example, @Param("selective") InteractionActivityPrize.Column ... selective);

    List<InteractionActivityPrize> selectByExampleSelective(@Param("example") InteractionActivityPrizeExample example, @Param("selective") InteractionActivityPrize.Column ... selective);

    List<InteractionActivityPrize> selectByExample(InteractionActivityPrizeExample example);

    InteractionActivityPrize selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") InteractionActivityPrize.Column ... selective);

    InteractionActivityPrize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InteractionActivityPrize record, @Param("example") InteractionActivityPrizeExample example);

    int updateByExample(@Param("record") InteractionActivityPrize record, @Param("example") InteractionActivityPrizeExample example);

    int updateByPrimaryKeySelective(InteractionActivityPrize record);

    int updateByPrimaryKey(InteractionActivityPrize record);
}