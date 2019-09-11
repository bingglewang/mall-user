package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsBrand;
import com.zsl.malluserdb.po.GoodsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBrandMapper {
    long countByExample(GoodsBrandExample example);

    int deleteByExample(GoodsBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    GoodsBrand selectOneByExample(GoodsBrandExample example);

    GoodsBrand selectOneByExampleSelective(@Param("example") GoodsBrandExample example, @Param("selective") GoodsBrand.Column ... selective);

    List<GoodsBrand> selectByExampleSelective(@Param("example") GoodsBrandExample example, @Param("selective") GoodsBrand.Column ... selective);

    List<GoodsBrand> selectByExample(GoodsBrandExample example);

    GoodsBrand selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsBrand.Column ... selective);

    GoodsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByExample(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}