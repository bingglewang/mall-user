package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.CollectShop;
import com.zsl.malluserdb.po.CollectShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectShopMapper {
    long countByExample(CollectShopExample example);

    int deleteByExample(CollectShopExample example);

    int deleteByPrimaryKey(Integer collectShopId);

    int insert(CollectShop record);

    int insertSelective(CollectShop record);

    CollectShop selectOneByExample(CollectShopExample example);

    CollectShop selectOneByExampleSelective(@Param("example") CollectShopExample example, @Param("selective") CollectShop.Column ... selective);

    List<CollectShop> selectByExampleSelective(@Param("example") CollectShopExample example, @Param("selective") CollectShop.Column ... selective);

    List<CollectShop> selectByExample(CollectShopExample example);

    CollectShop selectByPrimaryKeySelective(@Param("collectShopId") Integer collectShopId, @Param("selective") CollectShop.Column ... selective);

    CollectShop selectByPrimaryKey(Integer collectShopId);

    int updateByExampleSelective(@Param("record") CollectShop record, @Param("example") CollectShopExample example);

    int updateByExample(@Param("record") CollectShop record, @Param("example") CollectShopExample example);

    int updateByPrimaryKeySelective(CollectShop record);

    int updateByPrimaryKey(CollectShop record);
}