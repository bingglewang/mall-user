package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SuperiorTradeInfo;
import com.zsl.malluserdb.po.SuperiorTradeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperiorTradeInfoMapper {
    long countByExample(SuperiorTradeInfoExample example);

    int deleteByExample(SuperiorTradeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SuperiorTradeInfo record);

    int insertSelective(SuperiorTradeInfo record);

    SuperiorTradeInfo selectOneByExample(SuperiorTradeInfoExample example);

    SuperiorTradeInfo selectOneByExampleSelective(@Param("example") SuperiorTradeInfoExample example, @Param("selective") SuperiorTradeInfo.Column ... selective);

    List<SuperiorTradeInfo> selectByExampleSelective(@Param("example") SuperiorTradeInfoExample example, @Param("selective") SuperiorTradeInfo.Column ... selective);

    List<SuperiorTradeInfo> selectByExample(SuperiorTradeInfoExample example);

    SuperiorTradeInfo selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SuperiorTradeInfo.Column ... selective);

    SuperiorTradeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SuperiorTradeInfo record, @Param("example") SuperiorTradeInfoExample example);

    int updateByExample(@Param("record") SuperiorTradeInfo record, @Param("example") SuperiorTradeInfoExample example);

    int updateByPrimaryKeySelective(SuperiorTradeInfo record);

    int updateByPrimaryKey(SuperiorTradeInfo record);
}