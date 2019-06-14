package com.w.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer//开启configserver服务端
public class SpringcloudConfigserverApplication {

    //如何把配置文件放在git上
    /**
     * git上新建文件夹的规范
     *服务名称-环境.properties
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigserverApplication.class, args);
    }

}
