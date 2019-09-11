package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsSpuTag;
import com.zsl.malluserdb.po.GoodsSpuTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpuTagMapper {
    long countByExample(GoodsSpuTagExample example);

    int deleteByExample(GoodsSpuTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSpuTag record);

    int insertSelective(GoodsSpuTag record);

    GoodsSpuTag selectOneByExample(GoodsSpuTagExample example);

    GoodsSpuTag selectOneByExampleSelective(@Param("example") GoodsSpuTagExample example, @Param("selective") GoodsSpuTag.Column ... selective);

    List<GoodsSpuTag> selectByExampleSelective(@Param("example") GoodsSpuTagExample example, @Param("selective") GoodsSpuTag.Column ... selective);

    List<GoodsSpuTag> selectByExample(GoodsSpuTagExample example);

    GoodsSpuTag selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsSpuTag.Column ... selective);

    GoodsSpuTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSpuTag record, @Param("example") GoodsSpuTagExample example);

    int updateByExample(@Param("record") GoodsSpuTag record, @Param("example") GoodsSpuTagExample example);

    int updateByPrimaryKeySelective(GoodsSpuTag record);

    int updateByPrimaryKey(GoodsSpuTag record);
}