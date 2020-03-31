package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.SalesReturn;
import com.zsl.malluserdb.po.SalesReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesReturnMapper {
    long countByExample(SalesReturnExample example);

    int deleteByExample(SalesReturnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SalesReturn record);

    int insertSelective(SalesReturn record);

    SalesReturn selectOneByExample(SalesReturnExample example);

    SalesReturn selectOneByExampleSelective(@Param("example") SalesReturnExample example, @Param("selective") SalesReturn.Column ... selective);

    List<SalesReturn> selectByExampleSelective(@Param("example") SalesReturnExample example, @Param("selective") SalesReturn.Column ... selective);

    List<SalesReturn> selectByExample(SalesReturnExample example);

    SalesReturn selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SalesReturn.Column ... selective);

    SalesReturn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SalesReturn record, @Param("example") SalesReturnExample example);

    int updateByExample(@Param("record") SalesReturn record, @Param("example") SalesReturnExample example);

    int updateByPrimaryKeySelective(SalesReturn record);

    int updateByPrimaryKey(SalesReturn record);
}