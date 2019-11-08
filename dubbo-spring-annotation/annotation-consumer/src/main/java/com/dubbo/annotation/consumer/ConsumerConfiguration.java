package com.dubbo.annotation.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 15:10
 * @description:
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.dubbo.annotation.consumer")
@PropertySource("classpath:/consumer.properties")
@ComponentScan(value = {"com.dubbo.annotation.consumer"})
public class ConsumerConfiguration {
}
