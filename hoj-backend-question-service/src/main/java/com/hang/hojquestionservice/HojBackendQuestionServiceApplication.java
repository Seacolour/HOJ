package com.hang.hojquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hang.hojquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.hang")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.hang.hojserviceclient.service"})
public class HojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HojBackendQuestionServiceApplication.class, args);
    }

}
