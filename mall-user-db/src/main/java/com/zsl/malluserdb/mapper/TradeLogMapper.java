package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.TradeLog;
import com.zsl.malluserdb.po.TradeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeLogMapper {
    long countByExample(TradeLogExample example);

    int deleteByExample(TradeLogExample example);

    int deleteByPrimaryKey(Integer tradeLogId);

    int insert(TradeLog record);

    int insertSelective(TradeLog record);

    TradeLog selectOneByExample(TradeLogExample example);

    TradeLog selectOneByExampleSelective(@Param("example") TradeLogExample example, @Param("selective") TradeLog.Column ... selective);

    TradeLog selectOneByExampleWithBLOBs(TradeLogExample example);

    List<TradeLog> selectByExampleSelective(@Param("example") TradeLogExample example, @Param("selective") TradeLog.Column ... selective);

    List<TradeLog> selectByExampleWithBLOBs(TradeLogExample example);

    List<TradeLog> selectByExample(TradeLogExample example);

    TradeLog selectByPrimaryKeySelective(@Param("tradeLogId") Integer tradeLogId, @Param("selective") TradeLog.Column ... selective);

    TradeLog selectByPrimaryKey(Integer tradeLogId);

    int updateByExampleSelective(@Param("record") TradeLog record, @Param("example") TradeLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TradeLog record, @Param("example") TradeLogExample example);

    int updateByExample(@Param("record") TradeLog record, @Param("example") TradeLogExample example);

    int updateByPrimaryKeySelective(TradeLog record);

    int updateByPrimaryKeyWithBLOBs(TradeLog record);

    int updateByPrimaryKey(TradeLog record);
}