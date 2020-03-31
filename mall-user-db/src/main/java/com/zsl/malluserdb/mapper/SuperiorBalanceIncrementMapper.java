package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorBalanceIncrement;
import com.zsl.malluserdb.po.SuperiorBalanceIncrementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorBalanceIncrementMapper {
    long countByExample(SuperiorBalanceIncrementExample example);

    int deleteByExample(SuperiorBalanceIncrementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorBalanceIncrement record);

    int insertSelective(SuperiorBalanceIncrement record);

    SuperiorBalanceIncrement selectOneByExample(SuperiorBalanceIncrementExample example);

    SuperiorBalanceIncrement selectOneByExampleSelective(@Param("example") SuperiorBalanceIncrementExample example, @Param("selective") SuperiorBalanceIncrement.Column ... selective);

    List<SuperiorBalanceIncrement> selectByExampleSelective(@Param("example") SuperiorBalanceIncrementExample example, @Param("selective") SuperiorBalanceIncrement.Column ... selective);

    List<SuperiorBalanceIncrement> selectByExample(SuperiorBalanceIncrementExample example);

    SuperiorBalanceIncrement selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorBalanceIncrement.Column ... selective);

    SuperiorBalanceIncrement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorBalanceIncrement record, @Param("example") SuperiorBalanceIncrementExample example);

    int updateByExample(@Param("record") SuperiorBalanceIncrement record, @Param("example") SuperiorBalanceIncrementExample example);

    int updateByPrimaryKeySelective(SuperiorBalanceIncrement record);

    int updateByPrimaryKey(SuperiorBalanceIncrement record);
}