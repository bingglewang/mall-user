package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ItemFreightTemplate;
import com.zsl.malluserdb.po.ItemFreightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemFreightTemplateMapper {
    long countByExample(ItemFreightTemplateExample example);

    int deleteByExample(ItemFreightTemplateExample example);

    int deleteByPrimaryKey(Integer freightTemplateId);

    int insert(ItemFreightTemplate record);

    int insertSelective(ItemFreightTemplate record);

    ItemFreightTemplate selectOneByExample(ItemFreightTemplateExample example);

    ItemFreightTemplate selectOneByExampleSelective(@Param("example") ItemFreightTemplateExample example, @Param("selective") ItemFreightTemplate.Column ... selective);

    List<ItemFreightTemplate> selectByExampleSelective(@Param("example") ItemFreightTemplateExample example, @Param("selective") ItemFreightTemplate.Column ... selective);

    List<ItemFreightTemplate> selectByExample(ItemFreightTemplateExample example);

    ItemFreightTemplate selectByPrimaryKeySelective(@Param("freightTemplateId") Integer freightTemplateId, @Param("selective") ItemFreightTemplate.Column ... selective);

    ItemFreightTemplate selectByPrimaryKey(Integer freightTemplateId);

    int updateByExampleSelective(@Param("record") ItemFreightTemplate record, @Param("example") ItemFreightTemplateExample example);

    int updateByExample(@Param("record") ItemFreightTemplate record, @Param("example") ItemFreightTemplateExample example);

    int updateByPrimaryKeySelective(ItemFreightTemplate record);

    int updateByPrimaryKey(ItemFreightTemplate record);
}