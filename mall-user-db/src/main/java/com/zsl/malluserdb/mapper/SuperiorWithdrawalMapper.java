package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorWithdrawal;
import com.zsl.malluserdb.po.SuperiorWithdrawalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorWithdrawalMapper {
    long countByExample(SuperiorWithdrawalExample example);

    int deleteByExample(SuperiorWithdrawalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorWithdrawal record);

    int insertSelective(SuperiorWithdrawal record);

    SuperiorWithdrawal selectOneByExample(SuperiorWithdrawalExample example);

    SuperiorWithdrawal selectOneByExampleSelective(@Param("example") SuperiorWithdrawalExample example, @Param("selective") SuperiorWithdrawal.Column ... selective);

    List<SuperiorWithdrawal> selectByExampleSelective(@Param("example") SuperiorWithdrawalExample example, @Param("selective") SuperiorWithdrawal.Column ... selective);

    List<SuperiorWithdrawal> selectByExample(SuperiorWithdrawalExample example);

    SuperiorWithdrawal selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorWithdrawal.Column ... selective);

    SuperiorWithdrawal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorWithdrawal record, @Param("example") SuperiorWithdrawalExample example);

    int updateByExample(@Param("record") SuperiorWithdrawal record, @Param("example") SuperiorWithdrawalExample example);

    int updateByPrimaryKeySelective(SuperiorWithdrawal record);

    int updateByPrimaryKey(SuperiorWithdrawal record);
}