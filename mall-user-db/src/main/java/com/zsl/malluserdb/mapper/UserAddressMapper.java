package com.zsl.malluserdb.mapper;

import com.zsl.malluserdb.po.UserAddress;
import com.zsl.malluserdb.po.UserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {
    long countByExample(UserAddressExample example);

    int deleteByExample(UserAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectOneByExample(UserAddressExample example);

    UserAddress selectOneByExampleSelective(@Param("example") UserAddressExample example, @Param("selective") UserAddress.Column ... selective);

    List<UserAddress> selectByExampleSelective(@Param("example") UserAddressExample example, @Param("selective") UserAddress.Column ... selective);

    List<UserAddress> selectByExample(UserAddressExample example);

    UserAddress selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") UserAddress.Column ... selective);

    UserAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
}