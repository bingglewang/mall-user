package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.OrderDetailRate;
import com.zsl.malluserdb.po.OrderDetailRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailRateMapper {
    long countByExample(OrderDetailRateExample example);

    int deleteByExample(OrderDetailRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetailRate record);

    int insertSelective(OrderDetailRate record);

    OrderDetailRate selectOneByExample(OrderDetailRateExample example);

    OrderDetailRate selectOneByExampleSelective(@Param("example") OrderDetailRateExample example, @Param("selective") OrderDetailRate.Column ... selective);

    List<OrderDetailRate> selectByExampleSelective(@Param("example") OrderDetailRateExample example, @Param("selective") OrderDetailRate.Column ... selective);

    List<OrderDetailRate> selectByExample(OrderDetailRateExample example);

    OrderDetailRate selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") OrderDetailRate.Column ... selective);

    OrderDetailRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDetailRate record, @Param("example") OrderDetailRateExample example);

    int updateByExample(@Param("record") OrderDetailRate record, @Param("example") OrderDetailRateExample example);

    int updateByPrimaryKeySelective(OrderDetailRate record);

    int updateByPrimaryKey(OrderDetailRate record);
}