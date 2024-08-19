package com.hang.hojuserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hang.hojuserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.hang")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.hang.hojserviceclient.service"})
public class HojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HojBackendUserServiceApplication.class, args);
    }

}
