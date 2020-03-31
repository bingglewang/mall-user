package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.City;
import com.zsl.malluserdb.po.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectOneByExample(CityExample example);

    City selectOneByExampleSelective(@Param("example") CityExample example, @Param("selective") City.Column ... selective);

    List<City> selectByExampleSelective(@Param("example") CityExample example, @Param("selective") City.Column ... selective);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") City.Column ... selective);

    City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}