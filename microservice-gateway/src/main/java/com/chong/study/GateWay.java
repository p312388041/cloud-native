package com.chong.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GateWay {
    public static void main(String[] args) {
        SpringApplication.run(GateWay.class, args);
    }

    @Bean
    public RouteLocator redirectRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_router", r -> r.path("/get")
                        .uri("http://httpbin.org"))
                .build();
    }
}