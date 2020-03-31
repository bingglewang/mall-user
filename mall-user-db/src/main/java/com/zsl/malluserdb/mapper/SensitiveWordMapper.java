package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SensitiveWord;
import com.zsl.malluserdb.po.SensitiveWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SensitiveWordMapper {
    long countByExample(SensitiveWordExample example);

    int deleteByExample(SensitiveWordExample example);

    int deleteByPrimaryKey(Integer wordId);

    int insert(SensitiveWord record);

    int insertSelective(SensitiveWord record);

    SensitiveWord selectOneByExample(SensitiveWordExample example);

    SensitiveWord selectOneByExampleSelective(@Param("example") SensitiveWordExample example, @Param("selective") SensitiveWord.Column ... selective);

    List<SensitiveWord> selectByExampleSelective(@Param("example") SensitiveWordExample example, @Param("selective") SensitiveWord.Column ... selective);

    List<SensitiveWord> selectByExample(SensitiveWordExample example);

    SensitiveWord selectByPrimaryKeySelective(@Param("wordId") Integer wordId, @Param("selective") SensitiveWord.Column ... selective);

    SensitiveWord selectByPrimaryKey(Integer wordId);

    int updateByExampleSelective(@Param("record") SensitiveWord record, @Param("example") SensitiveWordExample example);

    int updateByExample(@Param("record") SensitiveWord record, @Param("example") SensitiveWordExample example);

    int updateByPrimaryKeySelective(SensitiveWord record);

    int updateByPrimaryKey(SensitiveWord record);
}