package com.example.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.provider.fallback.GlobeBlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 不是菜狗爱编程
 * @date: 2024/04/08/20:50
 * @description:
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @SentinelResource(value = "providerQuery",blockHandlerClass = GlobeBlockException.class, blockHandler = "blockHandler")
    @GetMapping("/query")
    public String query(){
        return "query...";
    }
}
