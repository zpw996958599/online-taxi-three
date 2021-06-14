package com.zpw.onlietaix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlieTaixApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlieTaixApplication.class, args);
    }

}
