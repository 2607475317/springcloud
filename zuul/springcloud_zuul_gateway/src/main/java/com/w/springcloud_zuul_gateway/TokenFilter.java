package com.w.springcloud_zuul_gateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 网关过滤器
 */
@Component
public class TokenFilter extends ZuulFilter {
    //过滤类型 pre表示在请求之前执行
    @Override
    public String filterType() {
        return "pre";
    }
    //过滤器执行顺序,当一个请求在同一阶段的存在多个过滤器，多个过滤器的执行顺序
    @Override
    public int filterOrder() {
        return 0;
    }
    //判断过滤器是否生效
    @Override
    public boolean shouldFilter() {
        return true;
    }
    //编写过滤器拦截业务逻辑代码
    @Override
    public Object run() throws ZuulException {
        //案例：拦截所有的服务接口，判断服务接口上是否有传递userToken信息
        //1获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        //2获取request
        HttpServletRequest request = currentContext.getRequest();
        //获取tokenn的时候从请求头中获取
        String userToken = request.getParameter("userToken");
        if (StringUtils.isEmpty(userToken)) {
            //不会继续进行...
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("userToken is null");
            return null;
        }
        // 否则正常执行业务逻辑.....
        return null;
    }
}
