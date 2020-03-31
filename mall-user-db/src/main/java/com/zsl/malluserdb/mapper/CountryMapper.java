package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Country;
import com.zsl.malluserdb.po.CountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountryMapper {
    long countByExample(CountryExample example);

    int deleteByExample(CountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectOneByExample(CountryExample example);

    Country selectOneByExampleSelective(@Param("example") CountryExample example, @Param("selective") Country.Column ... selective);

    List<Country> selectByExampleSelective(@Param("example") CountryExample example, @Param("selective") Country.Column ... selective);

    List<Country> selectByExample(CountryExample example);

    Country selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Country.Column ... selective);

    Country selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}