package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Miner;
import com.zsl.malluserdb.po.MinerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MinerMapper {
    long countByExample(MinerExample example);

    int deleteByExample(MinerExample example);

    int deleteByPrimaryKey(Integer minerId);

    int insert(Miner record);

    int insertSelective(Miner record);

    Miner selectOneByExample(MinerExample example);

    Miner selectOneByExampleSelective(@Param("example") MinerExample example, @Param("selective") Miner.Column ... selective);

    List<Miner> selectByExampleSelective(@Param("example") MinerExample example, @Param("selective") Miner.Column ... selective);

    List<Miner> selectByExample(MinerExample example);

    Miner selectByPrimaryKeySelective(@Param("minerId") Integer minerId, @Param("selective") Miner.Column ... selective);

    Miner selectByPrimaryKey(Integer minerId);

    int updateByExampleSelective(@Param("record") Miner record, @Param("example") MinerExample example);

    int updateByExample(@Param("record") Miner record, @Param("example") MinerExample example);

    int updateByPrimaryKeySelective(Miner record);

    int updateByPrimaryKey(Miner record);
}