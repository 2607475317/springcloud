package com.w.springcloudmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//将本服务注册到eureka
public class SpringcloudMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMemberApplication.class, args);
    }

}
