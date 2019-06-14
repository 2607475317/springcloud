package com.w.zookeeperorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperOrderApplication.class, args);
    }
    //解决RestTemplate找不到原因，应该吧RestTemplate注册到springboot容器中
    @Bean
    @LoadBalanced
//让RestTemplate在请求时拥有客户端负载均衡的能力
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}

