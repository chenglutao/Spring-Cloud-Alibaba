package com.spring.cloud.alibaba.nacos.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenglutao
 * @date 2020/1/7 23:01
 */
@RestController
public class NacosConfigController {

    @Autowired
    ConfigurableApplicationContext applicationContext;

    @GetMapping("/hello")
    public Object hello(){
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String age = applicationContext.getEnvironment().getProperty("user.age");
        return "hello " + userName + "\n" + "age " + age;
    }

}
