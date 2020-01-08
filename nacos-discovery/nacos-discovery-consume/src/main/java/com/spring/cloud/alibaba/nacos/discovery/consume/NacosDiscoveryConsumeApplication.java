package com.spring.cloud.alibaba.nacos.discovery.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumeApplication.class, args);
    }

}