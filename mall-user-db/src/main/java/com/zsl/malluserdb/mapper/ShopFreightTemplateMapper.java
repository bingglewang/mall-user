package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ShopFreightTemplate;
import com.zsl.malluserdb.po.ShopFreightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopFreightTemplateMapper {
    long countByExample(ShopFreightTemplateExample example);

    int deleteByExample(ShopFreightTemplateExample example);

    int deleteByPrimaryKey(Integer freightTemplateId);

    int insert(ShopFreightTemplate record);

    int insertSelective(ShopFreightTemplate record);

    ShopFreightTemplate selectOneByExample(ShopFreightTemplateExample example);

    ShopFreightTemplate selectOneByExampleSelective(@Param("example") ShopFreightTemplateExample example, @Param("selective") ShopFreightTemplate.Column ... selective);

    List<ShopFreightTemplate> selectByExampleSelective(@Param("example") ShopFreightTemplateExample example, @Param("selective") ShopFreightTemplate.Column ... selective);

    List<ShopFreightTemplate> selectByExample(ShopFreightTemplateExample example);

    ShopFreightTemplate selectByPrimaryKeySelective(@Param("freightTemplateId") Integer freightTemplateId, @Param("selective") ShopFreightTemplate.Column ... selective);

    ShopFreightTemplate selectByPrimaryKey(Integer freightTemplateId);

    int updateByExampleSelective(@Param("record") ShopFreightTemplate record, @Param("example") ShopFreightTemplateExample example);

    int updateByExample(@Param("record") ShopFreightTemplate record, @Param("example") ShopFreightTemplateExample example);

    int updateByPrimaryKeySelective(ShopFreightTemplate record);

    int updateByPrimaryKey(ShopFreightTemplate record);
}