package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ShopFreightTemplateDetailed;
import com.zsl.malluserdb.po.ShopFreightTemplateDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopFreightTemplateDetailedMapper {
    long countByExample(ShopFreightTemplateDetailedExample example);

    int deleteByExample(ShopFreightTemplateDetailedExample example);

    int deleteByPrimaryKey(Integer detailedId);

    int insert(ShopFreightTemplateDetailed record);

    int insertSelective(ShopFreightTemplateDetailed record);

    ShopFreightTemplateDetailed selectOneByExample(ShopFreightTemplateDetailedExample example);

    ShopFreightTemplateDetailed selectOneByExampleSelective(@Param("example") ShopFreightTemplateDetailedExample example, @Param("selective") ShopFreightTemplateDetailed.Column ... selective);

    List<ShopFreightTemplateDetailed> selectByExampleSelective(@Param("example") ShopFreightTemplateDetailedExample example, @Param("selective") ShopFreightTemplateDetailed.Column ... selective);

    List<ShopFreightTemplateDetailed> selectByExample(ShopFreightTemplateDetailedExample example);

    ShopFreightTemplateDetailed selectByPrimaryKeySelective(@Param("detailedId") Integer detailedId, @Param("selective") ShopFreightTemplateDetailed.Column ... selective);

    ShopFreightTemplateDetailed selectByPrimaryKey(Integer detailedId);

    int updateByExampleSelective(@Param("record") ShopFreightTemplateDetailed record, @Param("example") ShopFreightTemplateDetailedExample example);

    int updateByExample(@Param("record") ShopFreightTemplateDetailed record, @Param("example") ShopFreightTemplateDetailedExample example);

    int updateByPrimaryKeySelective(ShopFreightTemplateDetailed record);

    int updateByPrimaryKey(ShopFreightTemplateDetailed record);
}