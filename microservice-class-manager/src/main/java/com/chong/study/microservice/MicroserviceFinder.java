package com.chong.study.microservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@SpringBootApplication
public class MicroserviceFinder implements CommandLineRunner {
    @Autowired
    private EurekaClient eurekaClient;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceFinder.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Application> applications = eurekaClient.getApplications().getRegisteredApplications();
        System.out.println("---------" + applications.size());
        applications.stream().forEach(item -> {
            System.out.println(item.getName()); 
        });
    }
}