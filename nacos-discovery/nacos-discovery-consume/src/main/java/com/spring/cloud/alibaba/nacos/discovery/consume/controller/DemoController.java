package com.spring.cloud.alibaba.nacos.discovery.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author chenglutao
 */
@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 若RestTemplate使用Rbbion的API注解则此api无效
     * @param name
     * @return
     */
    @GetMapping("/test")
    public Object test(String name){
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-provider");
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/demo?name=" + name, String.class);
    }

    @GetMapping("/testRbbion")
    public Object testRbbion(String name){
        return restTemplate.getForObject("http://service-provider/demo?name=" + name, String.class);
    }


}
