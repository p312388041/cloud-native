package com.chong.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Config {

    @Autowired
    private Environment env;

    public String get(String key) {
        return env.getProperty(key);
    }
}
