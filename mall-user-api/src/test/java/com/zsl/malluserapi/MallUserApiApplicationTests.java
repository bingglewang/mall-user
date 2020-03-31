package com.zsl.malluserapi;

import com.zsl.malluserdb.mapper.UserAddressMapper;
import com.zsl.malluserdb.po.UserAddress;
import com.zsl.malluserdb.po.UserAddressExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MallUserApiApplication.class)
public class MallUserApiApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(MallUserApiApplicationTests.class);

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Test
    public void contextLoads() {
        UserAddressExample userAddressExample = new UserAddressExample();
        UserAddressExample.Criteria criteria = userAddressExample.createCriteria();
        criteria.andAreaIdIsNull();
        List<UserAddress > userAddresslist = userAddressMapper.selectByExample(userAddressExample);
        System.out.println("结果："+userAddresslist);
    }

}
