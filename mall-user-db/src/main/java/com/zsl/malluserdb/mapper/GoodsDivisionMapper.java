package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsDivision;
import com.zsl.malluserdb.po.GoodsDivisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsDivisionMapper {
    long countByExample(GoodsDivisionExample example);

    int deleteByExample(GoodsDivisionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsDivision record);

    int insertSelective(GoodsDivision record);

    GoodsDivision selectOneByExample(GoodsDivisionExample example);

    GoodsDivision selectOneByExampleSelective(@Param("example") GoodsDivisionExample example, @Param("selective") GoodsDivision.Column ... selective);

    List<GoodsDivision> selectByExampleSelective(@Param("example") GoodsDivisionExample example, @Param("selective") GoodsDivision.Column ... selective);

    List<GoodsDivision> selectByExample(GoodsDivisionExample example);

    GoodsDivision selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsDivision.Column ... selective);

    GoodsDivision selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsDivision record, @Param("example") GoodsDivisionExample example);

    int updateByExample(@Param("record") GoodsDivision record, @Param("example") GoodsDivisionExample example);

    int updateByPrimaryKeySelective(GoodsDivision record);

    int updateByPrimaryKey(GoodsDivision record);
}