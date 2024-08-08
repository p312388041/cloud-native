package com.chong.study.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.chong.study.entity") 
@EnableJpaRepositories(basePackages = "com.chong.study.repository")
public class StudentApplication {
    public static void main(String[] args) {

        SpringApplication.run(StudentApplication.class, args);
    }
}