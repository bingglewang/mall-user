package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsCategory;
import com.zsl.malluserdb.po.GoodsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCategoryMapper {
    long countByExample(GoodsCategoryExample example);

    int deleteByExample(GoodsCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsCategory record);

    int insertSelective(GoodsCategory record);

    GoodsCategory selectOneByExample(GoodsCategoryExample example);

    GoodsCategory selectOneByExampleSelective(@Param("example") GoodsCategoryExample example, @Param("selective") GoodsCategory.Column ... selective);

    List<GoodsCategory> selectByExampleSelective(@Param("example") GoodsCategoryExample example, @Param("selective") GoodsCategory.Column ... selective);

    List<GoodsCategory> selectByExample(GoodsCategoryExample example);

    GoodsCategory selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsCategory.Column ... selective);

    GoodsCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

    int updateByExample(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

    int updateByPrimaryKeySelective(GoodsCategory record);

    int updateByPrimaryKey(GoodsCategory record);
}