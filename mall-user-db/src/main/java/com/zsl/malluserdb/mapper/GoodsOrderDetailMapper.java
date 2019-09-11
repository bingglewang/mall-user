package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsOrderDetail;
import com.zsl.malluserdb.po.GoodsOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOrderDetailMapper {
    long countByExample(GoodsOrderDetailExample example);

    int deleteByExample(GoodsOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsOrderDetail record);

    int insertSelective(GoodsOrderDetail record);

    GoodsOrderDetail selectOneByExample(GoodsOrderDetailExample example);

    GoodsOrderDetail selectOneByExampleSelective(@Param("example") GoodsOrderDetailExample example, @Param("selective") GoodsOrderDetail.Column ... selective);

    List<GoodsOrderDetail> selectByExampleSelective(@Param("example") GoodsOrderDetailExample example, @Param("selective") GoodsOrderDetail.Column ... selective);

    List<GoodsOrderDetail> selectByExample(GoodsOrderDetailExample example);

    GoodsOrderDetail selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsOrderDetail.Column ... selective);

    GoodsOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsOrderDetail record, @Param("example") GoodsOrderDetailExample example);

    int updateByExample(@Param("record") GoodsOrderDetail record, @Param("example") GoodsOrderDetailExample example);

    int updateByPrimaryKeySelective(GoodsOrderDetail record);

    int updateByPrimaryKey(GoodsOrderDetail record);
}