package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserLink;
import com.zsl.malluserdb.po.UserLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLinkMapper {
    long countByExample(UserLinkExample example);

    int deleteByExample(UserLinkExample example);

    int insert(UserLink record);

    int insertSelective(UserLink record);

    UserLink selectOneByExample(UserLinkExample example);

    UserLink selectOneByExampleSelective(@Param("example") UserLinkExample example, @Param("selective") UserLink.Column ... selective);

    List<UserLink> selectByExampleSelective(@Param("example") UserLinkExample example, @Param("selective") UserLink.Column ... selective);

    List<UserLink> selectByExample(UserLinkExample example);

    int updateByExampleSelective(@Param("record") UserLink record, @Param("example") UserLinkExample example);

    int updateByExample(@Param("record") UserLink record, @Param("example") UserLinkExample example);
}