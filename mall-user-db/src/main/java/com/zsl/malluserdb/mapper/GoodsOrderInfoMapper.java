package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsOrderInfo;
import com.zsl.malluserdb.po.GoodsOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOrderInfoMapper {
    long countByExample(GoodsOrderInfoExample example);

    int deleteByExample(GoodsOrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsOrderInfo record);

    int insertSelective(GoodsOrderInfo record);

    GoodsOrderInfo selectOneByExample(GoodsOrderInfoExample example);

    GoodsOrderInfo selectOneByExampleSelective(@Param("example") GoodsOrderInfoExample example, @Param("selective") GoodsOrderInfo.Column ... selective);

    List<GoodsOrderInfo> selectByExampleSelective(@Param("example") GoodsOrderInfoExample example, @Param("selective") GoodsOrderInfo.Column ... selective);

    List<GoodsOrderInfo> selectByExample(GoodsOrderInfoExample example);

    GoodsOrderInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsOrderInfo.Column ... selective);

    GoodsOrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsOrderInfo record, @Param("example") GoodsOrderInfoExample example);

    int updateByExample(@Param("record") GoodsOrderInfo record, @Param("example") GoodsOrderInfoExample example);

    int updateByPrimaryKeySelective(GoodsOrderInfo record);

    int updateByPrimaryKey(GoodsOrderInfo record);
}