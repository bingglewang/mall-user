package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.BalanceSettle;
import com.zsl.malluserdb.po.BalanceSettleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceSettleMapper {
    long countByExample(BalanceSettleExample example);

    int deleteByExample(BalanceSettleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BalanceSettle record);

    int insertSelective(BalanceSettle record);

    BalanceSettle selectOneByExample(BalanceSettleExample example);

    BalanceSettle selectOneByExampleSelective(@Param("example") BalanceSettleExample example, @Param("selective") BalanceSettle.Column ... selective);

    List<BalanceSettle> selectByExampleSelective(@Param("example") BalanceSettleExample example, @Param("selective") BalanceSettle.Column ... selective);

    List<BalanceSettle> selectByExample(BalanceSettleExample example);

    BalanceSettle selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") BalanceSettle.Column ... selective);

    BalanceSettle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BalanceSettle record, @Param("example") BalanceSettleExample example);

    int updateByExample(@Param("record") BalanceSettle record, @Param("example") BalanceSettleExample example);

    int updateByPrimaryKeySelective(BalanceSettle record);

    int updateByPrimaryKey(BalanceSettle record);
}