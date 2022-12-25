package com.yangmufa.traineeblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yangmufa.traineeblog.dao") //添加 @Mapper 注解
public class TraineeBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(TraineeBlogApplication.class, args);
    }

}
