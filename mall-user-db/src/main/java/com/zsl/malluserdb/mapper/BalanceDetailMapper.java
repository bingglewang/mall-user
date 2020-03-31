package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.BalanceDetail;
import com.zsl.malluserdb.po.BalanceDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceDetailMapper {
    long countByExample(BalanceDetailExample example);

    int deleteByExample(BalanceDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BalanceDetail record);

    int insertSelective(BalanceDetail record);

    BalanceDetail selectOneByExample(BalanceDetailExample example);

    BalanceDetail selectOneByExampleSelective(@Param("example") BalanceDetailExample example, @Param("selective") BalanceDetail.Column ... selective);

    List<BalanceDetail> selectByExampleSelective(@Param("example") BalanceDetailExample example, @Param("selective") BalanceDetail.Column ... selective);

    List<BalanceDetail> selectByExample(BalanceDetailExample example);

    BalanceDetail selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") BalanceDetail.Column ... selective);

    BalanceDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BalanceDetail record, @Param("example") BalanceDetailExample example);

    int updateByExample(@Param("record") BalanceDetail record, @Param("example") BalanceDetailExample example);

    int updateByPrimaryKeySelective(BalanceDetail record);

    int updateByPrimaryKey(BalanceDetail record);
}