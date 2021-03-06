package com.atguigu.gulimall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.dao")
public class GulimailUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailUmsApplication.class, args);
    }

}
