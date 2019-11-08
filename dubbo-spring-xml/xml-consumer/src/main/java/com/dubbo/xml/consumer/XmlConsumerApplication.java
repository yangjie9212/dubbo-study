package com.dubbo.xml.consumer;

import com.dubbo.common.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.concurrent.CompletableFuture;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 14:25
 * @description:
 */
public class XmlConsumerApplication {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        System.out.println("consumer启动 ");
        DemoService demoService = context.getBean("demoService", DemoService.class);
        long t1=System.currentTimeMillis();
        System.out.println("开始调用");
        String hello = demoService.sayHello("world");
        long t2=System.currentTimeMillis();
        System.out.println("sayHello： "+hello+",耗时："+(t2-t1));

        CompletableFuture<String> future = demoService.sayHelloAsync("world");
        long t3=System.currentTimeMillis();
        System.out.println("异步调用结果: " + future.get()+",耗时："+(t3-t2));
    }
}
