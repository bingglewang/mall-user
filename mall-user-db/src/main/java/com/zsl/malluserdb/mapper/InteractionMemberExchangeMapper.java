package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.InteractionMemberExchange;
import com.zsl.malluserdb.po.InteractionMemberExchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InteractionMemberExchangeMapper {
    long countByExample(InteractionMemberExchangeExample example);

    int deleteByExample(InteractionMemberExchangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InteractionMemberExchange record);

    int insertSelective(InteractionMemberExchange record);

    InteractionMemberExchange selectOneByExample(InteractionMemberExchangeExample example);

    InteractionMemberExchange selectOneByExampleSelective(@Param("example") InteractionMemberExchangeExample example, @Param("selective") InteractionMemberExchange.Column ... selective);

    List<InteractionMemberExchange> selectByExampleSelective(@Param("example") InteractionMemberExchangeExample example, @Param("selective") InteractionMemberExchange.Column ... selective);

    List<InteractionMemberExchange> selectByExample(InteractionMemberExchangeExample example);

    InteractionMemberExchange selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") InteractionMemberExchange.Column ... selective);

    InteractionMemberExchange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InteractionMemberExchange record, @Param("example") InteractionMemberExchangeExample example);

    int updateByExample(@Param("record") InteractionMemberExchange record, @Param("example") InteractionMemberExchangeExample example);

    int updateByPrimaryKeySelective(InteractionMemberExchange record);

    int updateByPrimaryKey(InteractionMemberExchange record);
}