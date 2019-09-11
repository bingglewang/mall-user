package com.zsl.malluserapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.zsl.malluserdb.mapper","com.zsl.malluserapi.dao"})
@SpringBootApplication
public class MallUserApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallUserApiApplication.class, args);
    }

}
