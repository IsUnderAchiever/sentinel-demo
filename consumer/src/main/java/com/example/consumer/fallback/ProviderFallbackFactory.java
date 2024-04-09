package com.example.consumer.fallback;

import com.example.consumer.feign.ProviderClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: 不是菜狗爱编程
 * @date: 2024/04/08/21:13
 * @description:
 */
@Slf4j
public class ProviderFallbackFactory implements FallbackFactory<ProviderClient> {
    @Override
    public ProviderClient create(Throwable cause) {
        return new ProviderClient() {
            @Override
            public String query() {
                log.error("query报错:",cause);
                return "不好意思，当前服务拥挤，请稍后访问~";
            }
        };
    }
}
