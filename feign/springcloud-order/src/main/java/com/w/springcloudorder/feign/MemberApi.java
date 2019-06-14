package com.w.springcloudorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "app-itmayiedu-member")
public interface MemberApi {
    //feigin书写方式以springmvc接口形式书写
    //@FeignClient调用服务接口，name就是服务名称

    @RequestMapping("/getMember")
    public String getMember();
}
