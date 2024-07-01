package com.chong.study.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootApplication
@RestController
public class microservice1 {
    public static void main(String[] args) {
        SpringApplication.run(microservice1.class, args);
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}