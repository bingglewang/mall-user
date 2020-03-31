package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorBanner;
import com.zsl.malluserdb.po.SuperiorBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorBannerMapper {
    long countByExample(SuperiorBannerExample example);

    int deleteByExample(SuperiorBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorBanner record);

    int insertSelective(SuperiorBanner record);

    SuperiorBanner selectOneByExample(SuperiorBannerExample example);

    SuperiorBanner selectOneByExampleSelective(@Param("example") SuperiorBannerExample example, @Param("selective") SuperiorBanner.Column ... selective);

    List<SuperiorBanner> selectByExampleSelective(@Param("example") SuperiorBannerExample example, @Param("selective") SuperiorBanner.Column ... selective);

    List<SuperiorBanner> selectByExample(SuperiorBannerExample example);

    SuperiorBanner selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorBanner.Column ... selective);

    SuperiorBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorBanner record, @Param("example") SuperiorBannerExample example);

    int updateByExample(@Param("record") SuperiorBanner record, @Param("example") SuperiorBannerExample example);

    int updateByPrimaryKeySelective(SuperiorBanner record);

    int updateByPrimaryKey(SuperiorBanner record);
}