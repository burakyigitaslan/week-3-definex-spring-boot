package com.patika.onlineshoppingdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineShoppingDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShoppingDiscoveryApplication.class, args);
    }

}
