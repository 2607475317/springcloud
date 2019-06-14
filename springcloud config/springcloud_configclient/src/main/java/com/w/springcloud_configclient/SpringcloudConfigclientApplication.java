package com.w.springcloud_configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigclientApplication.class, args);
    }

}
