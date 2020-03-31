package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorGoodsDetail;
import com.zsl.malluserdb.po.SuperiorGoodsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorGoodsDetailMapper {
    long countByExample(SuperiorGoodsDetailExample example);

    int deleteByExample(SuperiorGoodsDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorGoodsDetail record);

    int insertSelective(SuperiorGoodsDetail record);

    SuperiorGoodsDetail selectOneByExample(SuperiorGoodsDetailExample example);

    SuperiorGoodsDetail selectOneByExampleSelective(@Param("example") SuperiorGoodsDetailExample example, @Param("selective") SuperiorGoodsDetail.Column ... selective);

    List<SuperiorGoodsDetail> selectByExampleSelective(@Param("example") SuperiorGoodsDetailExample example, @Param("selective") SuperiorGoodsDetail.Column ... selective);

    List<SuperiorGoodsDetail> selectByExample(SuperiorGoodsDetailExample example);

    SuperiorGoodsDetail selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorGoodsDetail.Column ... selective);

    SuperiorGoodsDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorGoodsDetail record, @Param("example") SuperiorGoodsDetailExample example);

    int updateByExample(@Param("record") SuperiorGoodsDetail record, @Param("example") SuperiorGoodsDetailExample example);

    int updateByPrimaryKeySelective(SuperiorGoodsDetail record);

    int updateByPrimaryKey(SuperiorGoodsDetail record);
}