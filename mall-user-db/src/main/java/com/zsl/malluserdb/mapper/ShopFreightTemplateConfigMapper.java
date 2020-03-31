package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ShopFreightTemplateConfig;
import com.zsl.malluserdb.po.ShopFreightTemplateConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopFreightTemplateConfigMapper {
    long countByExample(ShopFreightTemplateConfigExample example);

    int deleteByExample(ShopFreightTemplateConfigExample example);

    int deleteByPrimaryKey(Integer configId);

    int insert(ShopFreightTemplateConfig record);

    int insertSelective(ShopFreightTemplateConfig record);

    ShopFreightTemplateConfig selectOneByExample(ShopFreightTemplateConfigExample example);

    ShopFreightTemplateConfig selectOneByExampleSelective(@Param("example") ShopFreightTemplateConfigExample example, @Param("selective") ShopFreightTemplateConfig.Column ... selective);

    List<ShopFreightTemplateConfig> selectByExampleSelective(@Param("example") ShopFreightTemplateConfigExample example, @Param("selective") ShopFreightTemplateConfig.Column ... selective);

    List<ShopFreightTemplateConfig> selectByExample(ShopFreightTemplateConfigExample example);

    ShopFreightTemplateConfig selectByPrimaryKeySelective(@Param("configId") Integer configId, @Param("selective") ShopFreightTemplateConfig.Column ... selective);

    ShopFreightTemplateConfig selectByPrimaryKey(Integer configId);

    int updateByExampleSelective(@Param("record") ShopFreightTemplateConfig record, @Param("example") ShopFreightTemplateConfigExample example);

    int updateByExample(@Param("record") ShopFreightTemplateConfig record, @Param("example") ShopFreightTemplateConfigExample example);

    int updateByPrimaryKeySelective(ShopFreightTemplateConfig record);

    int updateByPrimaryKey(ShopFreightTemplateConfig record);
}