package com.zsl.malluserapi.service;

import com.zsl.malluserdb.po.UserAddress;

import java.util.List;

public interface AddressService {
    List<UserAddress> queryByUid(Integer uid);
    UserAddress query(Integer userId, Integer id);
    int add(UserAddress address);
    int update(UserAddress address);
    void delete(Integer id);
    UserAddress findDefault(Integer userId);
    void resetDefault(Integer userId,Integer id);
    void resetDefault1(Integer userId);
    List<UserAddress> querySelective(Integer userId, String name, Integer page, Integer limit, String sort, String order);
}
