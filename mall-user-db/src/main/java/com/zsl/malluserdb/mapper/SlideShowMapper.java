package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SlideShow;
import com.zsl.malluserdb.po.SlideShowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlideShowMapper {
    long countByExample(SlideShowExample example);

    int deleteByExample(SlideShowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SlideShow record);

    int insertSelective(SlideShow record);

    SlideShow selectOneByExample(SlideShowExample example);

    SlideShow selectOneByExampleSelective(@Param("example") SlideShowExample example, @Param("selective") SlideShow.Column ... selective);

    List<SlideShow> selectByExampleSelective(@Param("example") SlideShowExample example, @Param("selective") SlideShow.Column ... selective);

    List<SlideShow> selectByExample(SlideShowExample example);

    SlideShow selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SlideShow.Column ... selective);

    SlideShow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SlideShow record, @Param("example") SlideShowExample example);

    int updateByExample(@Param("record") SlideShow record, @Param("example") SlideShowExample example);

    int updateByPrimaryKeySelective(SlideShow record);

    int updateByPrimaryKey(SlideShow record);
}