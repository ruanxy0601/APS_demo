package com.ruanxy.apsDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rxy
 * @date 2019/10/10
 */
@SpringBootApplication
@MapperScan("com.ruanxy.apsDemo.dao")
@MapperScan("com.ruanxy.apsDemo.office")
public class ApsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApsDemoApplication.class, args);
    }

}
