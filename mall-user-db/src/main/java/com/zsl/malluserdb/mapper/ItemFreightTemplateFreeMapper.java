package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.ItemFreightTemplateFree;
import com.zsl.malluserdb.po.ItemFreightTemplateFreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemFreightTemplateFreeMapper {
    long countByExample(ItemFreightTemplateFreeExample example);

    int deleteByExample(ItemFreightTemplateFreeExample example);

    int deleteByPrimaryKey(Integer freeId);

    int insert(ItemFreightTemplateFree record);

    int insertSelective(ItemFreightTemplateFree record);

    ItemFreightTemplateFree selectOneByExample(ItemFreightTemplateFreeExample example);

    ItemFreightTemplateFree selectOneByExampleSelective(@Param("example") ItemFreightTemplateFreeExample example, @Param("selective") ItemFreightTemplateFree.Column ... selective);

    List<ItemFreightTemplateFree> selectByExampleSelective(@Param("example") ItemFreightTemplateFreeExample example, @Param("selective") ItemFreightTemplateFree.Column ... selective);

    List<ItemFreightTemplateFree> selectByExample(ItemFreightTemplateFreeExample example);

    ItemFreightTemplateFree selectByPrimaryKeySelective(@Param("freeId") Integer freeId, @Param("selective") ItemFreightTemplateFree.Column ... selective);

    ItemFreightTemplateFree selectByPrimaryKey(Integer freeId);

    int updateByExampleSelective(@Param("record") ItemFreightTemplateFree record, @Param("example") ItemFreightTemplateFreeExample example);

    int updateByExample(@Param("record") ItemFreightTemplateFree record, @Param("example") ItemFreightTemplateFreeExample example);

    int updateByPrimaryKeySelective(ItemFreightTemplateFree record);

    int updateByPrimaryKey(ItemFreightTemplateFree record);
}