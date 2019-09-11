package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsTradeInfo;
import com.zsl.malluserdb.po.GoodsTradeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsTradeInfoMapper {
    long countByExample(GoodsTradeInfoExample example);

    int deleteByExample(GoodsTradeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsTradeInfo record);

    int insertSelective(GoodsTradeInfo record);

    GoodsTradeInfo selectOneByExample(GoodsTradeInfoExample example);

    GoodsTradeInfo selectOneByExampleSelective(@Param("example") GoodsTradeInfoExample example, @Param("selective") GoodsTradeInfo.Column ... selective);

    List<GoodsTradeInfo> selectByExampleSelective(@Param("example") GoodsTradeInfoExample example, @Param("selective") GoodsTradeInfo.Column ... selective);

    List<GoodsTradeInfo> selectByExample(GoodsTradeInfoExample example);

    GoodsTradeInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsTradeInfo.Column ... selective);

    GoodsTradeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsTradeInfo record, @Param("example") GoodsTradeInfoExample example);

    int updateByExample(@Param("record") GoodsTradeInfo record, @Param("example") GoodsTradeInfoExample example);

    int updateByPrimaryKeySelective(GoodsTradeInfo record);

    int updateByPrimaryKey(GoodsTradeInfo record);
}