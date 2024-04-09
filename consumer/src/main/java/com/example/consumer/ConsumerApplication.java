package com.example.consumer;

import com.example.consumer.config.FeignConfig;
import com.example.consumer.feign.ProviderClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients(
        defaultConfiguration = FeignConfig.class,
        basePackageClasses = {
                ProviderClient.class
        }
)
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
