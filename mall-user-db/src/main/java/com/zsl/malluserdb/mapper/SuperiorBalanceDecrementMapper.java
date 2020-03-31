package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorBalanceDecrement;
import com.zsl.malluserdb.po.SuperiorBalanceDecrementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorBalanceDecrementMapper {
    long countByExample(SuperiorBalanceDecrementExample example);

    int deleteByExample(SuperiorBalanceDecrementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorBalanceDecrement record);

    int insertSelective(SuperiorBalanceDecrement record);

    SuperiorBalanceDecrement selectOneByExample(SuperiorBalanceDecrementExample example);

    SuperiorBalanceDecrement selectOneByExampleSelective(@Param("example") SuperiorBalanceDecrementExample example, @Param("selective") SuperiorBalanceDecrement.Column ... selective);

    List<SuperiorBalanceDecrement> selectByExampleSelective(@Param("example") SuperiorBalanceDecrementExample example, @Param("selective") SuperiorBalanceDecrement.Column ... selective);

    List<SuperiorBalanceDecrement> selectByExample(SuperiorBalanceDecrementExample example);

    SuperiorBalanceDecrement selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorBalanceDecrement.Column ... selective);

    SuperiorBalanceDecrement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorBalanceDecrement record, @Param("example") SuperiorBalanceDecrementExample example);

    int updateByExample(@Param("record") SuperiorBalanceDecrement record, @Param("example") SuperiorBalanceDecrementExample example);

    int updateByPrimaryKeySelective(SuperiorBalanceDecrement record);

    int updateByPrimaryKey(SuperiorBalanceDecrement record);
}