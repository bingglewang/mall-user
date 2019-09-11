package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserFeedback;
import com.zsl.malluserdb.po.UserFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFeedbackMapper {
    long countByExample(UserFeedbackExample example);

    int deleteByExample(UserFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFeedback record);

    int insertSelective(UserFeedback record);

    UserFeedback selectOneByExample(UserFeedbackExample example);

    UserFeedback selectOneByExampleSelective(@Param("example") UserFeedbackExample example, @Param("selective") UserFeedback.Column ... selective);

    List<UserFeedback> selectByExampleSelective(@Param("example") UserFeedbackExample example, @Param("selective") UserFeedback.Column ... selective);

    List<UserFeedback> selectByExample(UserFeedbackExample example);

    UserFeedback selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") UserFeedback.Column ... selective);

    UserFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByExample(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByPrimaryKeySelective(UserFeedback record);

    int updateByPrimaryKey(UserFeedback record);
}