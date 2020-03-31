package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.InteractionMemberPrize;
import com.zsl.malluserdb.po.InteractionMemberPrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteractionMemberPrizeMapper {
    long countByExample(InteractionMemberPrizeExample example);

    int deleteByExample(InteractionMemberPrizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InteractionMemberPrize record);

    int insertSelective(InteractionMemberPrize record);

    InteractionMemberPrize selectOneByExample(InteractionMemberPrizeExample example);

    InteractionMemberPrize selectOneByExampleSelective(@Param("example") InteractionMemberPrizeExample example, @Param("selective") InteractionMemberPrize.Column ... selective);

    List<InteractionMemberPrize> selectByExampleSelective(@Param("example") InteractionMemberPrizeExample example, @Param("selective") InteractionMemberPrize.Column ... selective);

    List<InteractionMemberPrize> selectByExample(InteractionMemberPrizeExample example);

    InteractionMemberPrize selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") InteractionMemberPrize.Column ... selective);

    InteractionMemberPrize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InteractionMemberPrize record, @Param("example") InteractionMemberPrizeExample example);

    int updateByExample(@Param("record") InteractionMemberPrize record, @Param("example") InteractionMemberPrizeExample example);

    int updateByPrimaryKeySelective(InteractionMemberPrize record);

    int updateByPrimaryKey(InteractionMemberPrize record);
}