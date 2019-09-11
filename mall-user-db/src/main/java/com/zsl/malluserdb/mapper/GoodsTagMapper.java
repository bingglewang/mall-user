package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsTag;
import com.zsl.malluserdb.po.GoodsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsTagMapper {
    long countByExample(GoodsTagExample example);

    int deleteByExample(GoodsTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsTag record);

    int insertSelective(GoodsTag record);

    GoodsTag selectOneByExample(GoodsTagExample example);

    GoodsTag selectOneByExampleSelective(@Param("example") GoodsTagExample example, @Param("selective") GoodsTag.Column ... selective);

    List<GoodsTag> selectByExampleSelective(@Param("example") GoodsTagExample example, @Param("selective") GoodsTag.Column ... selective);

    List<GoodsTag> selectByExample(GoodsTagExample example);

    GoodsTag selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsTag.Column ... selective);

    GoodsTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsTag record, @Param("example") GoodsTagExample example);

    int updateByExample(@Param("record") GoodsTag record, @Param("example") GoodsTagExample example);

    int updateByPrimaryKeySelective(GoodsTag record);

    int updateByPrimaryKey(GoodsTag record);
}