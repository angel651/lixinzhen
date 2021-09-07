package com.lixinzhen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.lixinzhen.dao")
public class LixinzhenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LixinzhenApplication.class, args);
    }

}
