package com.spring.cloud.alibaba.nacos.discovery.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryProviderApplication.class, args);
    }

}
