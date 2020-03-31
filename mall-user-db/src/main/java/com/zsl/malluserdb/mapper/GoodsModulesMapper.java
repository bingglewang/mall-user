package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsModules;
import com.zsl.malluserdb.po.GoodsModulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsModulesMapper {
    long countByExample(GoodsModulesExample example);

    int deleteByExample(GoodsModulesExample example);

    int deleteByPrimaryKey(Integer goodsModulesId);

    int insert(GoodsModules record);

    int insertSelective(GoodsModules record);

    GoodsModules selectOneByExample(GoodsModulesExample example);

    GoodsModules selectOneByExampleSelective(@Param("example") GoodsModulesExample example, @Param("selective") GoodsModules.Column ... selective);

    List<GoodsModules> selectByExampleSelective(@Param("example") GoodsModulesExample example, @Param("selective") GoodsModules.Column ... selective);

    List<GoodsModules> selectByExample(GoodsModulesExample example);

    GoodsModules selectByPrimaryKeySelective(@Param("goodsModulesId") Integer goodsModulesId, @Param("selective") GoodsModules.Column ... selective);

    GoodsModules selectByPrimaryKey(Integer goodsModulesId);

    int updateByExampleSelective(@Param("record") GoodsModules record, @Param("example") GoodsModulesExample example);

    int updateByExample(@Param("record") GoodsModules record, @Param("example") GoodsModulesExample example);

    int updateByPrimaryKeySelective(GoodsModules record);

    int updateByPrimaryKey(GoodsModules record);
}