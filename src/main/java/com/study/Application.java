package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * springBoot启动器
 *
 * @author HLH
 * @version 1.0
 * @email 17703595860@163.com
 */
@SpringBootApplication
@MapperScan(basePackages = "com.study.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}