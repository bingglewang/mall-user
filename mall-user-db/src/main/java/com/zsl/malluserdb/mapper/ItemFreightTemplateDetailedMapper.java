package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ItemFreightTemplateDetailed;
import com.zsl.malluserdb.po.ItemFreightTemplateDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemFreightTemplateDetailedMapper {
    long countByExample(ItemFreightTemplateDetailedExample example);

    int deleteByExample(ItemFreightTemplateDetailedExample example);

    int deleteByPrimaryKey(Integer detailedId);

    int insert(ItemFreightTemplateDetailed record);

    int insertSelective(ItemFreightTemplateDetailed record);

    ItemFreightTemplateDetailed selectOneByExample(ItemFreightTemplateDetailedExample example);

    ItemFreightTemplateDetailed selectOneByExampleSelective(@Param("example") ItemFreightTemplateDetailedExample example, @Param("selective") ItemFreightTemplateDetailed.Column ... selective);

    List<ItemFreightTemplateDetailed> selectByExampleSelective(@Param("example") ItemFreightTemplateDetailedExample example, @Param("selective") ItemFreightTemplateDetailed.Column ... selective);

    List<ItemFreightTemplateDetailed> selectByExample(ItemFreightTemplateDetailedExample example);

    ItemFreightTemplateDetailed selectByPrimaryKeySelective(@Param("detailedId") Integer detailedId, @Param("selective") ItemFreightTemplateDetailed.Column ... selective);

    ItemFreightTemplateDetailed selectByPrimaryKey(Integer detailedId);

    int updateByExampleSelective(@Param("record") ItemFreightTemplateDetailed record, @Param("example") ItemFreightTemplateDetailedExample example);

    int updateByExample(@Param("record") ItemFreightTemplateDetailed record, @Param("example") ItemFreightTemplateDetailedExample example);

    int updateByPrimaryKeySelective(ItemFreightTemplateDetailed record);

    int updateByPrimaryKey(ItemFreightTemplateDetailed record);
}