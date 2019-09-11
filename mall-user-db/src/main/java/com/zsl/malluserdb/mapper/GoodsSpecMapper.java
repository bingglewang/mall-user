package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsSpec;
import com.zsl.malluserdb.po.GoodsSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpecMapper {
    long countByExample(GoodsSpecExample example);

    int deleteByExample(GoodsSpecExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpec record);

    int insertSelective(GoodsSpec record);

    GoodsSpec selectOneByExample(GoodsSpecExample example);

    GoodsSpec selectOneByExampleSelective(@Param("example") GoodsSpecExample example, @Param("selective") GoodsSpec.Column ... selective);

    List<GoodsSpec> selectByExampleSelective(@Param("example") GoodsSpecExample example, @Param("selective") GoodsSpec.Column ... selective);

    List<GoodsSpec> selectByExample(GoodsSpecExample example);

    GoodsSpec selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsSpec.Column ... selective);

    GoodsSpec selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsSpec record, @Param("example") GoodsSpecExample example);

    int updateByExample(@Param("record") GoodsSpec record, @Param("example") GoodsSpecExample example);

    int updateByPrimaryKeySelective(GoodsSpec record);

    int updateByPrimaryKey(GoodsSpec record);
}