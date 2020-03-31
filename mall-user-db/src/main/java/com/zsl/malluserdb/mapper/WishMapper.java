package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.Wish;
import com.zsl.malluserdb.po.WishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WishMapper {
    long countByExample(WishExample example);

    int deleteByExample(WishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wish record);

    int insertSelective(Wish record);

    Wish selectOneByExample(WishExample example);

    Wish selectOneByExampleSelective(@Param("example") WishExample example, @Param("selective") Wish.Column ... selective);

    List<Wish> selectByExampleSelective(@Param("example") WishExample example, @Param("selective") Wish.Column ... selective);

    List<Wish> selectByExample(WishExample example);

    Wish selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") Wish.Column ... selective);

    Wish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wish record, @Param("example") WishExample example);

    int updateByExample(@Param("record") Wish record, @Param("example") WishExample example);

    int updateByPrimaryKeySelective(Wish record);

    int updateByPrimaryKey(Wish record);
}