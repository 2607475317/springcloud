package com.w.springcloudorder;

import com.w.springcloudorder.feign.MemberApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    public MemberApi memberApi;
    @RequestMapping("/feignMember")
    public String feignMember(){
        return memberApi.getMember();
    }
}
