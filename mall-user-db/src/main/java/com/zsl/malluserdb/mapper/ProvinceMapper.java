package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Province;
import com.zsl.malluserdb.po.ProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceMapper {
    long countByExample(ProvinceExample example);

    int deleteByExample(ProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectOneByExample(ProvinceExample example);

    Province selectOneByExampleSelective(@Param("example") ProvinceExample example, @Param("selective") Province.Column ... selective);

    List<Province> selectByExampleSelective(@Param("example") ProvinceExample example, @Param("selective") Province.Column ... selective);

    List<Province> selectByExample(ProvinceExample example);

    Province selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Province.Column ... selective);

    Province selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}