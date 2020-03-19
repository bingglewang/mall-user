package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.OrderList;
import com.zsl.malluserdb.po.OrderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderListMapper {
    long countByExample(OrderListExample example);

    int deleteByExample(OrderListExample example);

    int insert(OrderList record);

    int insertSelective(OrderList record);

    OrderList selectOneByExample(OrderListExample example);

    OrderList selectOneByExampleSelective(@Param("example") OrderListExample example, @Param("selective") OrderList.Column ... selective);

    OrderList selectOneByExampleWithBLOBs(OrderListExample example);

    List<OrderList> selectByExampleSelective(@Param("example") OrderListExample example, @Param("selective") OrderList.Column ... selective);

    List<OrderList> selectByExampleWithBLOBs(OrderListExample example);

    List<OrderList> selectByExample(OrderListExample example);

    int updateByExampleSelective(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByExample(@Param("record") OrderList record, @Param("example") OrderListExample example);
}