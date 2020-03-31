package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsActivity;
import com.zsl.malluserdb.po.GoodsActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsActivityMapper {
    long countByExample(GoodsActivityExample example);

    int deleteByExample(GoodsActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(GoodsActivity record);

    int insertSelective(GoodsActivity record);

    GoodsActivity selectOneByExample(GoodsActivityExample example);

    GoodsActivity selectOneByExampleSelective(@Param("example") GoodsActivityExample example, @Param("selective") GoodsActivity.Column ... selective);

    List<GoodsActivity> selectByExampleSelective(@Param("example") GoodsActivityExample example, @Param("selective") GoodsActivity.Column ... selective);

    List<GoodsActivity> selectByExample(GoodsActivityExample example);

    GoodsActivity selectByPrimaryKeySelective(@Param("activityId") Integer activityId, @Param("selective") GoodsActivity.Column ... selective);

    GoodsActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") GoodsActivity record, @Param("example") GoodsActivityExample example);

    int updateByExample(@Param("record") GoodsActivity record, @Param("example") GoodsActivityExample example);

    int updateByPrimaryKeySelective(GoodsActivity record);

    int updateByPrimaryKey(GoodsActivity record);
}