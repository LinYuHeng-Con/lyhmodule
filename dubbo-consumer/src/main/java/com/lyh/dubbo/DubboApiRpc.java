package com.lyh.dubbo;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class DubboApiRpc {

    @DubboReference
    private DubboApi dubboApi;

    public String sayHello() {
        System.out.println("hello");
        System.out.println("test");
        System.out.println("test");
        return dubboApi.sayHello();
    }

    public String dubboTest() {
        System.out.println("OneTest");
        return dubboApi.dubboTest();
    }
}
