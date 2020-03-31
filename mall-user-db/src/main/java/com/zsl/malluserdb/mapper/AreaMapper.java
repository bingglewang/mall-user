package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Area;
import com.zsl.malluserdb.po.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    long countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectOneByExample(AreaExample example);

    Area selectOneByExampleSelective(@Param("example") AreaExample example, @Param("selective") Area.Column ... selective);

    List<Area> selectByExampleSelective(@Param("example") AreaExample example, @Param("selective") Area.Column ... selective);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Area.Column ... selective);

    Area selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}