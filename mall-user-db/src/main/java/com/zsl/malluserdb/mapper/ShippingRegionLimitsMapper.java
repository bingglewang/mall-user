package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ShippingRegionLimits;
import com.zsl.malluserdb.po.ShippingRegionLimitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingRegionLimitsMapper {
    long countByExample(ShippingRegionLimitsExample example);

    int deleteByExample(ShippingRegionLimitsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShippingRegionLimits record);

    int insertSelective(ShippingRegionLimits record);

    ShippingRegionLimits selectOneByExample(ShippingRegionLimitsExample example);

    ShippingRegionLimits selectOneByExampleSelective(@Param("example") ShippingRegionLimitsExample example, @Param("selective") ShippingRegionLimits.Column ... selective);

    List<ShippingRegionLimits> selectByExampleSelective(@Param("example") ShippingRegionLimitsExample example, @Param("selective") ShippingRegionLimits.Column ... selective);

    List<ShippingRegionLimits> selectByExample(ShippingRegionLimitsExample example);

    ShippingRegionLimits selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShippingRegionLimits.Column ... selective);

    ShippingRegionLimits selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShippingRegionLimits record, @Param("example") ShippingRegionLimitsExample example);

    int updateByExample(@Param("record") ShippingRegionLimits record, @Param("example") ShippingRegionLimitsExample example);

    int updateByPrimaryKeySelective(ShippingRegionLimits record);

    int updateByPrimaryKey(ShippingRegionLimits record);
}