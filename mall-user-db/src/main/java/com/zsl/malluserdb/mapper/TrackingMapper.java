package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Tracking;
import com.zsl.malluserdb.po.TrackingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrackingMapper {
    long countByExample(TrackingExample example);

    int deleteByExample(TrackingExample example);

    int deleteByPrimaryKey(Integer trackingId);

    int insert(Tracking record);

    int insertSelective(Tracking record);

    Tracking selectOneByExample(TrackingExample example);

    Tracking selectOneByExampleSelective(@Param("example") TrackingExample example, @Param("selective") Tracking.Column ... selective);

    List<Tracking> selectByExampleSelective(@Param("example") TrackingExample example, @Param("selective") Tracking.Column ... selective);

    List<Tracking> selectByExample(TrackingExample example);

    Tracking selectByPrimaryKeySelective(@Param("trackingId") Integer trackingId, @Param("selective") Tracking.Column ... selective);

    Tracking selectByPrimaryKey(Integer trackingId);

    int updateByExampleSelective(@Param("record") Tracking record, @Param("example") TrackingExample example);

    int updateByExample(@Param("record") Tracking record, @Param("example") TrackingExample example);

    int updateByPrimaryKeySelective(Tracking record);

    int updateByPrimaryKey(Tracking record);
}