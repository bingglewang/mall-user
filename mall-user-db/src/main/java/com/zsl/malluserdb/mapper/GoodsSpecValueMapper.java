package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsSpecValue;
import com.zsl.malluserdb.po.GoodsSpecValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpecValueMapper {
    long countByExample(GoodsSpecValueExample example);

    int deleteByExample(GoodsSpecValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSpecValue record);

    int insertSelective(GoodsSpecValue record);

    GoodsSpecValue selectOneByExample(GoodsSpecValueExample example);

    GoodsSpecValue selectOneByExampleSelective(@Param("example") GoodsSpecValueExample example, @Param("selective") GoodsSpecValue.Column ... selective);

    List<GoodsSpecValue> selectByExampleSelective(@Param("example") GoodsSpecValueExample example, @Param("selective") GoodsSpecValue.Column ... selective);

    List<GoodsSpecValue> selectByExample(GoodsSpecValueExample example);

    GoodsSpecValue selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsSpecValue.Column ... selective);

    GoodsSpecValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsSpecValue record, @Param("example") GoodsSpecValueExample example);

    int updateByExample(@Param("record") GoodsSpecValue record, @Param("example") GoodsSpecValueExample example);

    int updateByPrimaryKeySelective(GoodsSpecValue record);

    int updateByPrimaryKey(GoodsSpecValue record);
}