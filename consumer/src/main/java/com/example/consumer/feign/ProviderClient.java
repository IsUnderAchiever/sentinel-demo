package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: 不是菜狗爱编程
 * @date: 2024/04/08/21:02
 * @description:
 */
@FeignClient(value = "provider-service")
public interface ProviderClient {
    @RequestMapping(value = "/provider/query",method = RequestMethod.GET)
    public String query();
}
