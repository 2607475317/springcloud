package com.w.springcloud_configclient.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${itmayieduInfo}")
    private String itmayieduInfo;

    @RequestMapping("/getitmayieduInfo")
    public String getitmayieduInfo(){
        return itmayieduInfo;
    }
}
