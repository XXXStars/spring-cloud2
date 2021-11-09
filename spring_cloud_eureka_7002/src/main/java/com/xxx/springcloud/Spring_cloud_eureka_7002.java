package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Spring_cloud_eureka_7002 {
    public static void main(String[] args) {
        SpringApplication.run(Spring_cloud_eureka_7002.class,args);
    }
}
