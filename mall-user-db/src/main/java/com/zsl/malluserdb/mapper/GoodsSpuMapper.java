package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsSpu;
import com.zsl.malluserdb.po.GoodsSpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpuMapper {
    long countByExample(GoodsSpuExample example);

    int deleteByExample(GoodsSpuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpu record);

    int insertSelective(GoodsSpu record);

    GoodsSpu selectOneByExample(GoodsSpuExample example);

    GoodsSpu selectOneByExampleSelective(@Param("example") GoodsSpuExample example, @Param("selective") GoodsSpu.Column ... selective);

    List<GoodsSpu> selectByExampleSelective(@Param("example") GoodsSpuExample example, @Param("selective") GoodsSpu.Column ... selective);

    List<GoodsSpu> selectByExample(GoodsSpuExample example);

    GoodsSpu selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsSpu.Column ... selective);

    GoodsSpu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsSpu record, @Param("example") GoodsSpuExample example);

    int updateByExample(@Param("record") GoodsSpu record, @Param("example") GoodsSpuExample example);

    int updateByPrimaryKeySelective(GoodsSpu record);

    int updateByPrimaryKey(GoodsSpu record);
}