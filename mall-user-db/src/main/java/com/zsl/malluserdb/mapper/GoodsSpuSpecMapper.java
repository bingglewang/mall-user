package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsSpuSpec;
import com.zsl.malluserdb.po.GoodsSpuSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpuSpecMapper {
    long countByExample(GoodsSpuSpecExample example);

    int deleteByExample(GoodsSpuSpecExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpuSpec record);

    int insertSelective(GoodsSpuSpec record);

    GoodsSpuSpec selectOneByExample(GoodsSpuSpecExample example);

    GoodsSpuSpec selectOneByExampleSelective(@Param("example") GoodsSpuSpecExample example, @Param("selective") GoodsSpuSpec.Column ... selective);

    List<GoodsSpuSpec> selectByExampleSelective(@Param("example") GoodsSpuSpecExample example, @Param("selective") GoodsSpuSpec.Column ... selective);

    List<GoodsSpuSpec> selectByExample(GoodsSpuSpecExample example);

    GoodsSpuSpec selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsSpuSpec.Column ... selective);

    GoodsSpuSpec selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsSpuSpec record, @Param("example") GoodsSpuSpecExample example);

    int updateByExample(@Param("record") GoodsSpuSpec record, @Param("example") GoodsSpuSpecExample example);

    int updateByPrimaryKeySelective(GoodsSpuSpec record);

    int updateByPrimaryKey(GoodsSpuSpec record);
}