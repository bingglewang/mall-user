package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsPicInfo;
import com.zsl.malluserdb.po.GoodsPicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPicInfoMapper {
    long countByExample(GoodsPicInfoExample example);

    int deleteByExample(GoodsPicInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsPicInfo record);

    int insertSelective(GoodsPicInfo record);

    GoodsPicInfo selectOneByExample(GoodsPicInfoExample example);

    GoodsPicInfo selectOneByExampleSelective(@Param("example") GoodsPicInfoExample example, @Param("selective") GoodsPicInfo.Column ... selective);

    List<GoodsPicInfo> selectByExampleSelective(@Param("example") GoodsPicInfoExample example, @Param("selective") GoodsPicInfo.Column ... selective);

    List<GoodsPicInfo> selectByExample(GoodsPicInfoExample example);

    GoodsPicInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GoodsPicInfo.Column ... selective);

    GoodsPicInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsPicInfo record, @Param("example") GoodsPicInfoExample example);

    int updateByExample(@Param("record") GoodsPicInfo record, @Param("example") GoodsPicInfoExample example);

    int updateByPrimaryKeySelective(GoodsPicInfo record);

    int updateByPrimaryKey(GoodsPicInfo record);
}