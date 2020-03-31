package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.RefundOrder;
import com.zsl.malluserdb.po.RefundOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundOrderMapper {
    long countByExample(RefundOrderExample example);

    int deleteByExample(RefundOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefundOrder record);

    int insertSelective(RefundOrder record);

    RefundOrder selectOneByExample(RefundOrderExample example);

    RefundOrder selectOneByExampleSelective(@Param("example") RefundOrderExample example, @Param("selective") RefundOrder.Column ... selective);

    List<RefundOrder> selectByExampleSelective(@Param("example") RefundOrderExample example, @Param("selective") RefundOrder.Column ... selective);

    List<RefundOrder> selectByExample(RefundOrderExample example);

    RefundOrder selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") RefundOrder.Column ... selective);

    RefundOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefundOrder record, @Param("example") RefundOrderExample example);

    int updateByExample(@Param("record") RefundOrder record, @Param("example") RefundOrderExample example);

    int updateByPrimaryKeySelective(RefundOrder record);

    int updateByPrimaryKey(RefundOrder record);
}