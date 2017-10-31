package com.szu.service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.szu.dao.DemoService;
import com.szu.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kamyang on 2017/10/31.
 */
@Service
public class SayHelloServiceImpl implements SayHelloService {
    @Autowired
    private DemoService service;

    public String sayHello(String name) {
        String hello = service.sayHello(name);
        System.out.println(hello+"\n request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return hello + "\nservice provider:" + RpcContext.getContext().getLocalAddress();
    }
}
