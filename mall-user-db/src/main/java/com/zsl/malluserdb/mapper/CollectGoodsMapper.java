package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.CollectGoods;
import com.zsl.malluserdb.po.CollectGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectGoodsMapper {
    long countByExample(CollectGoodsExample example);

    int deleteByExample(CollectGoodsExample example);

    int deleteByPrimaryKey(Integer collectGoodsId);

    int insert(CollectGoods record);

    int insertSelective(CollectGoods record);

    CollectGoods selectOneByExample(CollectGoodsExample example);

    CollectGoods selectOneByExampleSelective(@Param("example") CollectGoodsExample example, @Param("selective") CollectGoods.Column ... selective);

    List<CollectGoods> selectByExampleSelective(@Param("example") CollectGoodsExample example, @Param("selective") CollectGoods.Column ... selective);

    List<CollectGoods> selectByExample(CollectGoodsExample example);

    CollectGoods selectByPrimaryKeySelective(@Param("collectGoodsId") Integer collectGoodsId, @Param("selective") CollectGoods.Column ... selective);

    CollectGoods selectByPrimaryKey(Integer collectGoodsId);

    int updateByExampleSelective(@Param("record") CollectGoods record, @Param("example") CollectGoodsExample example);

    int updateByExample(@Param("record") CollectGoods record, @Param("example") CollectGoodsExample example);

    int updateByPrimaryKeySelective(CollectGoods record);

    int updateByPrimaryKey(CollectGoods record);
}