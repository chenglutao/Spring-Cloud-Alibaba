package com.spring.cloud.alibaba.nacos.discovery.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenglutao
 */
@RestController
public class DemoController {

    @GetMapping("demo")
    public Object demo(String name){
        return "Hello:" + name;
    }
}
