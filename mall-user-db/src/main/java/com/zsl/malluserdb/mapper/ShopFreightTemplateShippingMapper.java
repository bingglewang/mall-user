package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ShopFreightTemplateShipping;
import com.zsl.malluserdb.po.ShopFreightTemplateShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopFreightTemplateShippingMapper {
    long countByExample(ShopFreightTemplateShippingExample example);

    int deleteByExample(ShopFreightTemplateShippingExample example);

    int deleteByPrimaryKey(Integer shippingId);

    int insert(ShopFreightTemplateShipping record);

    int insertSelective(ShopFreightTemplateShipping record);

    ShopFreightTemplateShipping selectOneByExample(ShopFreightTemplateShippingExample example);

    ShopFreightTemplateShipping selectOneByExampleSelective(@Param("example") ShopFreightTemplateShippingExample example, @Param("selective") ShopFreightTemplateShipping.Column ... selective);

    List<ShopFreightTemplateShipping> selectByExampleSelective(@Param("example") ShopFreightTemplateShippingExample example, @Param("selective") ShopFreightTemplateShipping.Column ... selective);

    List<ShopFreightTemplateShipping> selectByExample(ShopFreightTemplateShippingExample example);

    ShopFreightTemplateShipping selectByPrimaryKeySelective(@Param("shippingId") Integer shippingId, @Param("selective") ShopFreightTemplateShipping.Column ... selective);

    ShopFreightTemplateShipping selectByPrimaryKey(Integer shippingId);

    int updateByExampleSelective(@Param("record") ShopFreightTemplateShipping record, @Param("example") ShopFreightTemplateShippingExample example);

    int updateByExample(@Param("record") ShopFreightTemplateShipping record, @Param("example") ShopFreightTemplateShippingExample example);

    int updateByPrimaryKeySelective(ShopFreightTemplateShipping record);

    int updateByPrimaryKey(ShopFreightTemplateShipping record);
}