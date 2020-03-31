package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.BalanceRatio;
import com.zsl.malluserdb.po.BalanceRatioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceRatioMapper {
    long countByExample(BalanceRatioExample example);

    int deleteByExample(BalanceRatioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BalanceRatio record);

    int insertSelective(BalanceRatio record);

    BalanceRatio selectOneByExample(BalanceRatioExample example);

    BalanceRatio selectOneByExampleSelective(@Param("example") BalanceRatioExample example, @Param("selective") BalanceRatio.Column ... selective);

    List<BalanceRatio> selectByExampleSelective(@Param("example") BalanceRatioExample example, @Param("selective") BalanceRatio.Column ... selective);

    List<BalanceRatio> selectByExample(BalanceRatioExample example);

    BalanceRatio selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") BalanceRatio.Column ... selective);

    BalanceRatio selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BalanceRatio record, @Param("example") BalanceRatioExample example);

    int updateByExample(@Param("record") BalanceRatio record, @Param("example") BalanceRatioExample example);

    int updateByPrimaryKeySelective(BalanceRatio record);

    int updateByPrimaryKey(BalanceRatio record);
}