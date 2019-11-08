package com.dubbo.annotation.consumer;

import com.dubbo.common.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @auther: 杨杰
 * @date: 2019/11/7 15:09
 * @description:
 */
@Component("annotationAction")
public class AnnotationAction {

    @Reference
    DemoService annotationService;

    public String doSayHello(String name) {
        return annotationService.sayHello(name);
    }
}