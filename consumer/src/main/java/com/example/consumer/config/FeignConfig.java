package com.example.consumer.config;

import com.example.consumer.fallback.ProviderFallbackFactory;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 不是菜狗爱编程
 * @date: 2024/04/08/21:22
 * @description:
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLogLevel() {
        return Logger.Level.BASIC;
    }

    @Bean
    public ProviderFallbackFactory providerFallbackFactory(){
        return new ProviderFallbackFactory();
    }
}
