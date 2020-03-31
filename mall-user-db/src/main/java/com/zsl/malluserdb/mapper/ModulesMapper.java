package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Modules;
import com.zsl.malluserdb.po.ModulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModulesMapper {
    long countByExample(ModulesExample example);

    int deleteByExample(ModulesExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(Modules record);

    int insertSelective(Modules record);

    Modules selectOneByExample(ModulesExample example);

    Modules selectOneByExampleSelective(@Param("example") ModulesExample example, @Param("selective") Modules.Column ... selective);

    List<Modules> selectByExampleSelective(@Param("example") ModulesExample example, @Param("selective") Modules.Column ... selective);

    List<Modules> selectByExample(ModulesExample example);

    Modules selectByPrimaryKeySelective(@Param("moduleId") Integer moduleId, @Param("selective") Modules.Column ... selective);

    Modules selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") Modules record, @Param("example") ModulesExample example);

    int updateByExample(@Param("record") Modules record, @Param("example") ModulesExample example);

    int updateByPrimaryKeySelective(Modules record);

    int updateByPrimaryKey(Modules record);
}