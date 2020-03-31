package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorStockIncrement;
import com.zsl.malluserdb.po.SuperiorStockIncrementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorStockIncrementMapper {
    long countByExample(SuperiorStockIncrementExample example);

    int deleteByExample(SuperiorStockIncrementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorStockIncrement record);

    int insertSelective(SuperiorStockIncrement record);

    SuperiorStockIncrement selectOneByExample(SuperiorStockIncrementExample example);

    SuperiorStockIncrement selectOneByExampleSelective(@Param("example") SuperiorStockIncrementExample example, @Param("selective") SuperiorStockIncrement.Column ... selective);

    List<SuperiorStockIncrement> selectByExampleSelective(@Param("example") SuperiorStockIncrementExample example, @Param("selective") SuperiorStockIncrement.Column ... selective);

    List<SuperiorStockIncrement> selectByExample(SuperiorStockIncrementExample example);

    SuperiorStockIncrement selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorStockIncrement.Column ... selective);

    SuperiorStockIncrement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorStockIncrement record, @Param("example") SuperiorStockIncrementExample example);

    int updateByExample(@Param("record") SuperiorStockIncrement record, @Param("example") SuperiorStockIncrementExample example);

    int updateByPrimaryKeySelective(SuperiorStockIncrement record);

    int updateByPrimaryKey(SuperiorStockIncrement record);
}