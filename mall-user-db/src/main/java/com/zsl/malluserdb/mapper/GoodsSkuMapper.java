package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsSku;
import com.zsl.malluserdb.po.GoodsSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSkuMapper {
    long countByExample(GoodsSkuExample example);

    int deleteByExample(GoodsSkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSku record);

    int insertSelective(GoodsSku record);

    GoodsSku selectOneByExample(GoodsSkuExample example);

    GoodsSku selectOneByExampleSelective(@Param("example") GoodsSkuExample example, @Param("selective") GoodsSku.Column ... selective);

    List<GoodsSku> selectByExampleSelective(@Param("example") GoodsSkuExample example, @Param("selective") GoodsSku.Column ... selective);

    List<GoodsSku> selectByExample(GoodsSkuExample example);

    GoodsSku selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsSku.Column ... selective);

    GoodsSku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByExample(@Param("record") GoodsSku record, @Param("example") GoodsSkuExample example);

    int updateByPrimaryKeySelective(GoodsSku record);

    int updateByPrimaryKey(GoodsSku record);
}