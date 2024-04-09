package com.example.consumer.controller;

import com.example.consumer.feign.ProviderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 不是菜狗爱编程
 * @date: 2024/04/08/20:51
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private ProviderClient providerClient;


    //@SentinelResource(value = "consumerQuery", blockHandlerClass = GlobeBlockException.class, blockHandler = "blockHandler")
    @GetMapping("/query")
    public String query() {
        String query = providerClient.query();
        log.info("consumer成功消费");
        return query;
    }
}
