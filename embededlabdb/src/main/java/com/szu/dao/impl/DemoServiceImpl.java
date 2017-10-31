
package com.szu.dao.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.szu.dao.DemoService;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {

        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}