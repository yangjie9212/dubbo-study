package com.dubbo.annotation.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 15:11
 * @description:
 */
public class AnnotationConsumerApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
        String hello = annotationAction.doSayHello("world");
        System.out.println("结果输出："+hello);
    }

}
