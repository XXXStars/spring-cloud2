package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableZuulProxy
public class Spring_cloud_consumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(Spring_cloud_consumer_80.class,args);
    }
}
