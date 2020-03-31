package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.MerchantFreightTemplateConfig;
import com.zsl.malluserdb.po.MerchantFreightTemplateConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantFreightTemplateConfigMapper {
    long countByExample(MerchantFreightTemplateConfigExample example);

    int deleteByExample(MerchantFreightTemplateConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantFreightTemplateConfig record);

    int insertSelective(MerchantFreightTemplateConfig record);

    MerchantFreightTemplateConfig selectOneByExample(MerchantFreightTemplateConfigExample example);

    MerchantFreightTemplateConfig selectOneByExampleSelective(@Param("example") MerchantFreightTemplateConfigExample example, @Param("selective") MerchantFreightTemplateConfig.Column ... selective);

    List<MerchantFreightTemplateConfig> selectByExampleSelective(@Param("example") MerchantFreightTemplateConfigExample example, @Param("selective") MerchantFreightTemplateConfig.Column ... selective);

    List<MerchantFreightTemplateConfig> selectByExample(MerchantFreightTemplateConfigExample example);

    MerchantFreightTemplateConfig selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MerchantFreightTemplateConfig.Column ... selective);

    MerchantFreightTemplateConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantFreightTemplateConfig record, @Param("example") MerchantFreightTemplateConfigExample example);

    int updateByExample(@Param("record") MerchantFreightTemplateConfig record, @Param("example") MerchantFreightTemplateConfigExample example);

    int updateByPrimaryKeySelective(MerchantFreightTemplateConfig record);

    int updateByPrimaryKey(MerchantFreightTemplateConfig record);
}