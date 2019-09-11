package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.OrderDetail;
import com.zsl.malluserdb.po.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    long countByExample(OrderDetailExample example);

    int deleteByExample(OrderDetailExample example);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectOneByExample(OrderDetailExample example);

    OrderDetail selectOneByExampleSelective(@Param("example") OrderDetailExample example, @Param("selective") OrderDetail.Column ... selective);

    List<OrderDetail> selectByExampleSelective(@Param("example") OrderDetailExample example, @Param("selective") OrderDetail.Column ... selective);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);
}