package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsOrderCart;
import com.zsl.malluserdb.po.GoodsOrderCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOrderCartMapper {
    long countByExample(GoodsOrderCartExample example);

    int deleteByExample(GoodsOrderCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsOrderCart record);

    int insertSelective(GoodsOrderCart record);

    GoodsOrderCart selectOneByExample(GoodsOrderCartExample example);

    GoodsOrderCart selectOneByExampleSelective(@Param("example") GoodsOrderCartExample example, @Param("selective") GoodsOrderCart.Column ... selective);

    List<GoodsOrderCart> selectByExampleSelective(@Param("example") GoodsOrderCartExample example, @Param("selective") GoodsOrderCart.Column ... selective);

    List<GoodsOrderCart> selectByExample(GoodsOrderCartExample example);

    GoodsOrderCart selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsOrderCart.Column ... selective);

    GoodsOrderCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsOrderCart record, @Param("example") GoodsOrderCartExample example);

    int updateByExample(@Param("record") GoodsOrderCart record, @Param("example") GoodsOrderCartExample example);

    int updateByPrimaryKeySelective(GoodsOrderCart record);

    int updateByPrimaryKey(GoodsOrderCart record);
}