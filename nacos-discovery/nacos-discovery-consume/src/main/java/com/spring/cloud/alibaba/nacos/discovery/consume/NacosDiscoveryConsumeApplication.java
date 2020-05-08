package com.spring.cloud.alibaba.nacos.discovery.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenglutao
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumeApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate (){
        return new RestTemplate();
    }
}
