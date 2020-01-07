package com.spring.cloud.alibaba.nacos.nacosconfig.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author chenglutao
 * @date 2020/1/7 22:45
 */
public class PasswordUtils {

    public String passwordEncoder(String password){
        return new BCryptPasswordEncoder().encode(password);
    }
}
