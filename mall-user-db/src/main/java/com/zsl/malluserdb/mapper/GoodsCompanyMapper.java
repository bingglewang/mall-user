package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.GoodsCompany;
import com.zsl.malluserdb.po.GoodsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCompanyMapper {
    long countByExample(GoodsCompanyExample example);

    int deleteByExample(GoodsCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsCompany record);

    int insertSelective(GoodsCompany record);

    GoodsCompany selectOneByExample(GoodsCompanyExample example);

    GoodsCompany selectOneByExampleSelective(@Param("example") GoodsCompanyExample example, @Param("selective") GoodsCompany.Column ... selective);

    List<GoodsCompany> selectByExampleSelective(@Param("example") GoodsCompanyExample example, @Param("selective") GoodsCompany.Column ... selective);

    List<GoodsCompany> selectByExample(GoodsCompanyExample example);

    GoodsCompany selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") GoodsCompany.Column ... selective);

    GoodsCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsCompany record, @Param("example") GoodsCompanyExample example);

    int updateByExample(@Param("record") GoodsCompany record, @Param("example") GoodsCompanyExample example);

    int updateByPrimaryKeySelective(GoodsCompany record);

    int updateByPrimaryKey(GoodsCompany record);
}