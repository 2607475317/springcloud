package com.w.springcloudconsul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulMemberController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/getMember")
    public String getMember(){
  return "订单服务端口号为："+serverPort;
    }

}
