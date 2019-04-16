package com.baizhi.hlp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.hlp.dao")
public class BootEmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootEmsApplication.class, args);
    }

}
