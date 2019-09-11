package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsImage;
import com.zsl.malluserdb.po.GoodsImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsImageMapper {
    long countByExample(GoodsImageExample example);

    int deleteByExample(GoodsImageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsImage record);

    int insertSelective(GoodsImage record);

    GoodsImage selectOneByExample(GoodsImageExample example);

    GoodsImage selectOneByExampleSelective(@Param("example") GoodsImageExample example, @Param("selective") GoodsImage.Column ... selective);

    List<GoodsImage> selectByExampleSelective(@Param("example") GoodsImageExample example, @Param("selective") GoodsImage.Column ... selective);

    List<GoodsImage> selectByExample(GoodsImageExample example);

    GoodsImage selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsImage.Column ... selective);

    GoodsImage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsImage record, @Param("example") GoodsImageExample example);

    int updateByExample(@Param("record") GoodsImage record, @Param("example") GoodsImageExample example);

    int updateByPrimaryKeySelective(GoodsImage record);

    int updateByPrimaryKey(GoodsImage record);
}