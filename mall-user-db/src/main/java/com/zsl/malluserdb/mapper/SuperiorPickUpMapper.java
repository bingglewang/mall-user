package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorPickUp;
import com.zsl.malluserdb.po.SuperiorPickUpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorPickUpMapper {
    long countByExample(SuperiorPickUpExample example);

    int deleteByExample(SuperiorPickUpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorPickUp record);

    int insertSelective(SuperiorPickUp record);

    SuperiorPickUp selectOneByExample(SuperiorPickUpExample example);

    SuperiorPickUp selectOneByExampleSelective(@Param("example") SuperiorPickUpExample example, @Param("selective") SuperiorPickUp.Column ... selective);

    List<SuperiorPickUp> selectByExampleSelective(@Param("example") SuperiorPickUpExample example, @Param("selective") SuperiorPickUp.Column ... selective);

    List<SuperiorPickUp> selectByExample(SuperiorPickUpExample example);

    SuperiorPickUp selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorPickUp.Column ... selective);

    SuperiorPickUp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorPickUp record, @Param("example") SuperiorPickUpExample example);

    int updateByExample(@Param("record") SuperiorPickUp record, @Param("example") SuperiorPickUpExample example);

    int updateByPrimaryKeySelective(SuperiorPickUp record);

    int updateByPrimaryKey(SuperiorPickUp record);
}