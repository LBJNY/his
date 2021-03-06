package com.study.statistics.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author libaojie
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.study.erp.mapper"})
@EnableDubbo
public class ErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpApplication.class, args);
        System.out.println("ERP子系统启动成功");
    }

}
