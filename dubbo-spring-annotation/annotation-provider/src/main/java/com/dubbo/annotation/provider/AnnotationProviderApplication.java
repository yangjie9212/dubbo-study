package com.dubbo.annotation.provider;

import com.dubbo.annotation.provider.config.ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 14:22
 * @description:
 */
public class AnnotationProviderApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();

        System.out.println("dubbo service started.");
        new CountDownLatch(1).await();
    }

}
