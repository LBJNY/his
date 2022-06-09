package com.study.doctor.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author libaojie
 */
@SpringBootApplication
@MapperScan(basePackages = "com.study.doctor.mapper")
@EnableDubbo
public class DoctorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorApplication.class, args);
        System.out.println("医生子系统启动成功");
    }

}
