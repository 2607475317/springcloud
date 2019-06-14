package com.w.springcloudorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//可以开启feign客户端
public class SpringcloudOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrderApplication.class, args);


    }



}
