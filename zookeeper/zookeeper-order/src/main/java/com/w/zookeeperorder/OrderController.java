package com.w.zookeeperorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    //RestTemplate是springboot web组件提供，默认整合ribbon负载均衡器
    //rest方式底层使用HttpClint方式
    @Autowired
    private RestTemplate restTemplate;

    /**
     * springcloud有两种方式调用 rest,fegin(springcloud)
     * @return
     */
    @RequestMapping("/getOrder")
    //订单服务调用会员服务
    public String getOrder(){
        //直接调用，使用别名去注册中心获取对应的服务调用地址
        String url="http://zk-member/getMember";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("订单服务调用会员服务"+result);
        return result;
    }
}
