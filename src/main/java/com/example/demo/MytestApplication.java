package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.*.*"})
@MapperScan("com.example.demo.dao")
public class MytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytestApplication.class, args);
    }

}