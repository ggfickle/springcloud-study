package com.hf.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyBatisConfig
 * @author: xiehongfei
 * @description:
 **/
@Configuration
@MapperScan({"com.hf.springcloud.dao"})
public class MyBatisConfig {
}
