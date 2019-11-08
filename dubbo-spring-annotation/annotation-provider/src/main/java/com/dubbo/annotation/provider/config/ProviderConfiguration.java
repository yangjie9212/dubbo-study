package com.dubbo.annotation.provider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 14:48
 * @description:
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.dubbo.annotation.provider.impl")
@PropertySource("classpath:/provider.properties")
public class ProviderConfiguration {
}
