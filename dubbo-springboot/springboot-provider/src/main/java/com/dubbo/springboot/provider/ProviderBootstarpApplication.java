package com.dubbo.springboot.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 16:32
 * @description:
 */
@SpringBootApplication
@EnableDubbo
public class ProviderBootstarpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBootstarpApplication.class, args);
    }

}
