package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.AppVersion;
import com.zsl.malluserdb.po.AppVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVersionMapper {
    long countByExample(AppVersionExample example);

    int deleteByExample(AppVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppVersion record);

    int insertSelective(AppVersion record);

    AppVersion selectOneByExample(AppVersionExample example);

    AppVersion selectOneByExampleSelective(@Param("example") AppVersionExample example, @Param("selective") AppVersion.Column ... selective);

    List<AppVersion> selectByExampleSelective(@Param("example") AppVersionExample example, @Param("selective") AppVersion.Column ... selective);

    List<AppVersion> selectByExample(AppVersionExample example);

    AppVersion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") AppVersion.Column ... selective);

    AppVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    int updateByExample(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    int updateByPrimaryKeySelective(AppVersion record);

    int updateByPrimaryKey(AppVersion record);
}