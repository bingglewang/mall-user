package com.zsl.malluserapi.service.impl;

import com.github.pagehelper.PageHelper;
import com.zsl.malluserapi.service.AddressService;
import com.zsl.malluserdb.mapper.UserAddressMapper;
import com.zsl.malluserdb.po.UserAddress;
import com.zsl.malluserdb.po.UserAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> queryByUid(Integer uid) {
        UserAddressExample example = new UserAddressExample();
        example.or().andMemberIdEqualTo(uid).andStatusEqualTo(new Byte("1"));
        return userAddressMapper.selectByExample(example);
    }

    @Override
    public UserAddress query(Integer userId, Integer id) {
        UserAddressExample example = new UserAddressExample();
        example.or().andIdEqualTo(id).andMemberIdEqualTo(userId).andStatusEqualTo(new Byte("1"));
        return userAddressMapper.selectOneByExample(example);
    }

    @Override
    @Transactional
    public int add(UserAddress address) {
        address.setCreateTime(new Date());
        address.setModifyTime(new Date());
        return userAddressMapper.insertSelective(address);
    }

    @Override
    @Transactional
    public int update(UserAddress address) {
        address.setModifyTime(new Date());
        return userAddressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        userAddressMapper.deleteByPrimaryKey(id);
    }
    @Override
    public UserAddress findDefault(Integer userId) {
        UserAddressExample example = new UserAddressExample();
        example.or().andMemberIdEqualTo(userId).andIsDefaultEqualTo(true).andStatusEqualTo(new Byte("1"));
        return userAddressMapper.selectOneByExample(example);
    }

    @Override
    public void resetDefault1(Integer userId) {
        UserAddress address = new UserAddress();
        address.setIsDefault(false);
        address.setModifyTime(new Date());
        UserAddressExample example = new UserAddressExample();
        example.or().andMemberIdEqualTo(userId).andStatusEqualTo(new Byte("1"));
        userAddressMapper.updateByExampleSelective(address, example);
    }


    @Override
    @Transactional
    public void resetDefault(Integer userId,Integer id) {
        //查出用户之前的默认地址
        UserAddress beforeDefault = findDefault(userId);
        if(beforeDefault != null) {
            UserAddress beforeAddress = new UserAddress();
            beforeAddress.setIsDefault(false);
            beforeAddress.setModifyTime(new Date());
            beforeAddress.setId(beforeDefault.getId());
            userAddressMapper.updateByPrimaryKeySelective(beforeAddress);
        }
        //将现在的设置成默认地址
        UserAddress nowAddress = new UserAddress();
        nowAddress.setIsDefault(true);
        nowAddress.setModifyTime(new Date());
        nowAddress.setId(id);
        userAddressMapper.updateByPrimaryKeySelective(nowAddress);
    }

    @Override
    public List<UserAddress> querySelective(Integer userId, String name, Integer page, Integer limit, String sort, String order) {
        UserAddressExample example = new UserAddressExample();
        UserAddressExample.Criteria criteria = example.createCriteria();

        if (userId != null) {
            criteria.andMemberIdEqualTo(userId);
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andConsigneeEqualTo("%" + name + "%");
        }
        criteria.andStatusEqualTo(new Byte("1"));

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return userAddressMapper.selectByExample(example);
    }
}
