package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.*.*"})
@MapperScan("com.example.demo.dao")
@EnableSwagger2
public class MytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytestApplication.class, args);
    }

}