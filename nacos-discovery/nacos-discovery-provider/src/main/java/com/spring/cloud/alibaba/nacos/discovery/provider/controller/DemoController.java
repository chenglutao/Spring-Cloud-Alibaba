package com.spring.cloud.alibaba.nacos.discovery.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenglutao
 * @date 2020-01-08 13:58
 */
@RestController
public class DemoController {

    @GetMapping("demo")
    public Object demo(String name){
        return "Hello " + name;
    }
}
