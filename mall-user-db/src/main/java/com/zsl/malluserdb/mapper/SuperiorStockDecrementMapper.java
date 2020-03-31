package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorStockDecrement;
import com.zsl.malluserdb.po.SuperiorStockDecrementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorStockDecrementMapper {
    long countByExample(SuperiorStockDecrementExample example);

    int deleteByExample(SuperiorStockDecrementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorStockDecrement record);

    int insertSelective(SuperiorStockDecrement record);

    SuperiorStockDecrement selectOneByExample(SuperiorStockDecrementExample example);

    SuperiorStockDecrement selectOneByExampleSelective(@Param("example") SuperiorStockDecrementExample example, @Param("selective") SuperiorStockDecrement.Column ... selective);

    List<SuperiorStockDecrement> selectByExampleSelective(@Param("example") SuperiorStockDecrementExample example, @Param("selective") SuperiorStockDecrement.Column ... selective);

    List<SuperiorStockDecrement> selectByExample(SuperiorStockDecrementExample example);

    SuperiorStockDecrement selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorStockDecrement.Column ... selective);

    SuperiorStockDecrement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorStockDecrement record, @Param("example") SuperiorStockDecrementExample example);

    int updateByExample(@Param("record") SuperiorStockDecrement record, @Param("example") SuperiorStockDecrementExample example);

    int updateByPrimaryKeySelective(SuperiorStockDecrement record);

    int updateByPrimaryKey(SuperiorStockDecrement record);
}