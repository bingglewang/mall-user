package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.DivisionSpu;
import com.zsl.malluserdb.po.DivisionSpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DivisionSpuMapper {
    long countByExample(DivisionSpuExample example);

    int deleteByExample(DivisionSpuExample example);

    int deleteByPrimaryKey(Integer middleId);

    int insert(DivisionSpu record);

    int insertSelective(DivisionSpu record);

    DivisionSpu selectOneByExample(DivisionSpuExample example);

    DivisionSpu selectOneByExampleSelective(@Param("example") DivisionSpuExample example, @Param("selective") DivisionSpu.Column ... selective);

    List<DivisionSpu> selectByExampleSelective(@Param("example") DivisionSpuExample example, @Param("selective") DivisionSpu.Column ... selective);

    List<DivisionSpu> selectByExample(DivisionSpuExample example);

    DivisionSpu selectByPrimaryKeySelective(@Param("middleId") Integer middleId, @Param("selective") DivisionSpu.Column ... selective);

    DivisionSpu selectByPrimaryKey(Integer middleId);

    int updateByExampleSelective(@Param("record") DivisionSpu record, @Param("example") DivisionSpuExample example);

    int updateByExample(@Param("record") DivisionSpu record, @Param("example") DivisionSpuExample example);

    int updateByPrimaryKeySelective(DivisionSpu record);

    int updateByPrimaryKey(DivisionSpu record);
}