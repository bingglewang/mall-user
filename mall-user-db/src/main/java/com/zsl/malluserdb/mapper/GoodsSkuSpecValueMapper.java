package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsSkuSpecValue;
import com.zsl.malluserdb.po.GoodsSkuSpecValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSkuSpecValueMapper {
    long countByExample(GoodsSkuSpecValueExample example);

    int deleteByExample(GoodsSkuSpecValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSkuSpecValue record);

    int insertSelective(GoodsSkuSpecValue record);

    GoodsSkuSpecValue selectOneByExample(GoodsSkuSpecValueExample example);

    GoodsSkuSpecValue selectOneByExampleSelective(@Param("example") GoodsSkuSpecValueExample example, @Param("selective") GoodsSkuSpecValue.Column ... selective);

    List<GoodsSkuSpecValue> selectByExampleSelective(@Param("example") GoodsSkuSpecValueExample example, @Param("selective") GoodsSkuSpecValue.Column ... selective);

    List<GoodsSkuSpecValue> selectByExample(GoodsSkuSpecValueExample example);

    GoodsSkuSpecValue selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsSkuSpecValue.Column ... selective);

    GoodsSkuSpecValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsSkuSpecValue record, @Param("example") GoodsSkuSpecValueExample example);

    int updateByExample(@Param("record") GoodsSkuSpecValue record, @Param("example") GoodsSkuSpecValueExample example);

    int updateByPrimaryKeySelective(GoodsSkuSpecValue record);

    int updateByPrimaryKey(GoodsSkuSpecValue record);
}