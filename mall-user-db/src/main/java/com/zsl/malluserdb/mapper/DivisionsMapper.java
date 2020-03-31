package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Divisions;
import com.zsl.malluserdb.po.DivisionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DivisionsMapper {
    long countByExample(DivisionsExample example);

    int deleteByExample(DivisionsExample example);

    int deleteByPrimaryKey(Integer divisionId);

    int insert(Divisions record);

    int insertSelective(Divisions record);

    Divisions selectOneByExample(DivisionsExample example);

    Divisions selectOneByExampleSelective(@Param("example") DivisionsExample example, @Param("selective") Divisions.Column ... selective);

    List<Divisions> selectByExampleSelective(@Param("example") DivisionsExample example, @Param("selective") Divisions.Column ... selective);

    List<Divisions> selectByExample(DivisionsExample example);

    Divisions selectByPrimaryKeySelective(@Param("divisionId") Integer divisionId, @Param("selective") Divisions.Column ... selective);

    Divisions selectByPrimaryKey(Integer divisionId);

    int updateByExampleSelective(@Param("record") Divisions record, @Param("example") DivisionsExample example);

    int updateByExample(@Param("record") Divisions record, @Param("example") DivisionsExample example);

    int updateByPrimaryKeySelective(Divisions record);

    int updateByPrimaryKey(Divisions record);
}