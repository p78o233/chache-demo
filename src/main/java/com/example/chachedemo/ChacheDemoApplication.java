package com.example.chachedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.example.chachedemo.mapper")
@SpringBootApplication
@EnableCaching
public class ChacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChacheDemoApplication.class, args);
    }

}
