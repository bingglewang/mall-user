package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorStockBalanceTransaction;
import com.zsl.malluserdb.po.SuperiorStockBalanceTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorStockBalanceTransactionMapper {
    long countByExample(SuperiorStockBalanceTransactionExample example);

    int deleteByExample(SuperiorStockBalanceTransactionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorStockBalanceTransaction record);

    int insertSelective(SuperiorStockBalanceTransaction record);

    SuperiorStockBalanceTransaction selectOneByExample(SuperiorStockBalanceTransactionExample example);

    SuperiorStockBalanceTransaction selectOneByExampleSelective(@Param("example") SuperiorStockBalanceTransactionExample example, @Param("selective") SuperiorStockBalanceTransaction.Column ... selective);

    List<SuperiorStockBalanceTransaction> selectByExampleSelective(@Param("example") SuperiorStockBalanceTransactionExample example, @Param("selective") SuperiorStockBalanceTransaction.Column ... selective);

    List<SuperiorStockBalanceTransaction> selectByExample(SuperiorStockBalanceTransactionExample example);

    SuperiorStockBalanceTransaction selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorStockBalanceTransaction.Column ... selective);

    SuperiorStockBalanceTransaction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorStockBalanceTransaction record, @Param("example") SuperiorStockBalanceTransactionExample example);

    int updateByExample(@Param("record") SuperiorStockBalanceTransaction record, @Param("example") SuperiorStockBalanceTransactionExample example);

    int updateByPrimaryKeySelective(SuperiorStockBalanceTransaction record);

    int updateByPrimaryKey(SuperiorStockBalanceTransaction record);
}