package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.RefundOrderDetail;
import com.zsl.malluserdb.po.RefundOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundOrderDetailMapper {
    long countByExample(RefundOrderDetailExample example);

    int deleteByExample(RefundOrderDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefundOrderDetail record);

    int insertSelective(RefundOrderDetail record);

    RefundOrderDetail selectOneByExample(RefundOrderDetailExample example);

    RefundOrderDetail selectOneByExampleSelective(@Param("example") RefundOrderDetailExample example, @Param("selective") RefundOrderDetail.Column ... selective);

    List<RefundOrderDetail> selectByExampleSelective(@Param("example") RefundOrderDetailExample example, @Param("selective") RefundOrderDetail.Column ... selective);

    List<RefundOrderDetail> selectByExample(RefundOrderDetailExample example);

    RefundOrderDetail selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") RefundOrderDetail.Column ... selective);

    RefundOrderDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefundOrderDetail record, @Param("example") RefundOrderDetailExample example);

    int updateByExample(@Param("record") RefundOrderDetail record, @Param("example") RefundOrderDetailExample example);

    int updateByPrimaryKeySelective(RefundOrderDetail record);

    int updateByPrimaryKey(RefundOrderDetail record);
}