package com.w.springcloudorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrderApplication.class, args);

        //如果使用rest方式以别名方式进行调用，要依赖ribbon负载均衡器@LoadBalanced
    }
    //解决RestTemplate找不到原因，应该吧RestTemplate注册到springboot容器中
    @Bean
    @LoadBalanced//让RestTemplate在请求时拥有客户端负载均衡的能力
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
