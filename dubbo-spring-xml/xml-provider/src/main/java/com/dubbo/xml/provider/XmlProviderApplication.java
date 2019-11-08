package com.dubbo.xml.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 14:22
 * @description:
 */
public class XmlProviderApplication {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();
        System.out.println("provider服务启动");
        System.in.read();
    }

}
