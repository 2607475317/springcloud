package com.w.springcloudmember.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberApiController {
    @RequestMapping("/getMember")
    public String getMember(){
        return "我是会员服务";
    }
}
