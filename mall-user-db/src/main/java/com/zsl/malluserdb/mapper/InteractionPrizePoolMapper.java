package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.InteractionPrizePool;
import com.zsl.malluserdb.po.InteractionPrizePoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteractionPrizePoolMapper {
    long countByExample(InteractionPrizePoolExample example);

    int deleteByExample(InteractionPrizePoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InteractionPrizePool record);

    int insertSelective(InteractionPrizePool record);

    InteractionPrizePool selectOneByExample(InteractionPrizePoolExample example);

    InteractionPrizePool selectOneByExampleSelective(@Param("example") InteractionPrizePoolExample example, @Param("selective") InteractionPrizePool.Column ... selective);

    List<InteractionPrizePool> selectByExampleSelective(@Param("example") InteractionPrizePoolExample example, @Param("selective") InteractionPrizePool.Column ... selective);

    List<InteractionPrizePool> selectByExample(InteractionPrizePoolExample example);

    InteractionPrizePool selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") InteractionPrizePool.Column ... selective);

    InteractionPrizePool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InteractionPrizePool record, @Param("example") InteractionPrizePoolExample example);

    int updateByExample(@Param("record") InteractionPrizePool record, @Param("example") InteractionPrizePoolExample example);

    int updateByPrimaryKeySelective(InteractionPrizePool record);

    int updateByPrimaryKey(InteractionPrizePool record);
}