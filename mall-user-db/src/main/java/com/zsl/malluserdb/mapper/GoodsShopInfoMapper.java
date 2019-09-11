package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsShopInfo;
import com.zsl.malluserdb.po.GoodsShopInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShopInfoMapper {
    long countByExample(GoodsShopInfoExample example);

    int deleteByExample(GoodsShopInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsShopInfo record);

    int insertSelective(GoodsShopInfo record);

    GoodsShopInfo selectOneByExample(GoodsShopInfoExample example);

    GoodsShopInfo selectOneByExampleSelective(@Param("example") GoodsShopInfoExample example, @Param("selective") GoodsShopInfo.Column ... selective);

    List<GoodsShopInfo> selectByExampleSelective(@Param("example") GoodsShopInfoExample example, @Param("selective") GoodsShopInfo.Column ... selective);

    List<GoodsShopInfo> selectByExample(GoodsShopInfoExample example);

    GoodsShopInfo selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsShopInfo.Column ... selective);

    GoodsShopInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsShopInfo record, @Param("example") GoodsShopInfoExample example);

    int updateByExample(@Param("record") GoodsShopInfo record, @Param("example") GoodsShopInfoExample example);

    int updateByPrimaryKeySelective(GoodsShopInfo record);

    int updateByPrimaryKey(GoodsShopInfo record);
}