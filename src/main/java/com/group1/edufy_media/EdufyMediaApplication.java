package com.group1.edufy_media;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EdufyMediaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdufyMediaApplication.class, args);
    }

}
