package com.w.springcloudzookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//如果服务使用connsul,zookeeper，使用@EnableDiscoveryClient向注册中心注册服务
public class SpringcloudZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZookeeperApplication.class, args);
    }

}
