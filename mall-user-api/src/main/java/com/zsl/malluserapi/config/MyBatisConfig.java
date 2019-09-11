package com.zsl.malluserapi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by wangbinggui on 2019/5/27.
 */
@Configuration
@MapperScan({"com.zsl.malluserdb.mapper","com.zsl.malluserapi.dao"})
public class MyBatisConfig {
}
