package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsBackgroundImage;
import com.zsl.malluserdb.po.GoodsBackgroundImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBackgroundImageMapper {
    long countByExample(GoodsBackgroundImageExample example);

    int deleteByExample(GoodsBackgroundImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBackgroundImage record);

    int insertSelective(GoodsBackgroundImage record);

    GoodsBackgroundImage selectOneByExample(GoodsBackgroundImageExample example);

    GoodsBackgroundImage selectOneByExampleSelective(@Param("example") GoodsBackgroundImageExample example, @Param("selective") GoodsBackgroundImage.Column ... selective);

    List<GoodsBackgroundImage> selectByExampleSelective(@Param("example") GoodsBackgroundImageExample example, @Param("selective") GoodsBackgroundImage.Column ... selective);

    List<GoodsBackgroundImage> selectByExample(GoodsBackgroundImageExample example);

    GoodsBackgroundImage selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsBackgroundImage.Column ... selective);

    GoodsBackgroundImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsBackgroundImage record, @Param("example") GoodsBackgroundImageExample example);

    int updateByExample(@Param("record") GoodsBackgroundImage record, @Param("example") GoodsBackgroundImageExample example);

    int updateByPrimaryKeySelective(GoodsBackgroundImage record);

    int updateByPrimaryKey(GoodsBackgroundImage record);
}