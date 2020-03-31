package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.BackLog;
import com.zsl.malluserdb.po.BackLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackLogMapper {
    long countByExample(BackLogExample example);

    int deleteByExample(BackLogExample example);

    int deleteByPrimaryKey(Integer backLogId);

    int insert(BackLog record);

    int insertSelective(BackLog record);

    BackLog selectOneByExample(BackLogExample example);

    BackLog selectOneByExampleSelective(@Param("example") BackLogExample example, @Param("selective") BackLog.Column ... selective);

    BackLog selectOneByExampleWithBLOBs(BackLogExample example);

    List<BackLog> selectByExampleSelective(@Param("example") BackLogExample example, @Param("selective") BackLog.Column ... selective);

    List<BackLog> selectByExampleWithBLOBs(BackLogExample example);

    List<BackLog> selectByExample(BackLogExample example);

    BackLog selectByPrimaryKeySelective(@Param("backLogId") Integer backLogId, @Param("selective") BackLog.Column ... selective);

    BackLog selectByPrimaryKey(Integer backLogId);

    int updateByExampleSelective(@Param("record") BackLog record, @Param("example") BackLogExample example);

    int updateByExampleWithBLOBs(@Param("record") BackLog record, @Param("example") BackLogExample example);

    int updateByExample(@Param("record") BackLog record, @Param("example") BackLogExample example);

    int updateByPrimaryKeySelective(BackLog record);

    int updateByPrimaryKeyWithBLOBs(BackLog record);

    int updateByPrimaryKey(BackLog record);
}