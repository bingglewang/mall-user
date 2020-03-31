package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorBankCard;
import com.zsl.malluserdb.po.SuperiorBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorBankCardMapper {
    long countByExample(SuperiorBankCardExample example);

    int deleteByExample(SuperiorBankCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorBankCard record);

    int insertSelective(SuperiorBankCard record);

    SuperiorBankCard selectOneByExample(SuperiorBankCardExample example);

    SuperiorBankCard selectOneByExampleSelective(@Param("example") SuperiorBankCardExample example, @Param("selective") SuperiorBankCard.Column ... selective);

    List<SuperiorBankCard> selectByExampleSelective(@Param("example") SuperiorBankCardExample example, @Param("selective") SuperiorBankCard.Column ... selective);

    List<SuperiorBankCard> selectByExample(SuperiorBankCardExample example);

    SuperiorBankCard selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorBankCard.Column ... selective);

    SuperiorBankCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorBankCard record, @Param("example") SuperiorBankCardExample example);

    int updateByExample(@Param("record") SuperiorBankCard record, @Param("example") SuperiorBankCardExample example);

    int updateByPrimaryKeySelective(SuperiorBankCard record);

    int updateByPrimaryKey(SuperiorBankCard record);
}