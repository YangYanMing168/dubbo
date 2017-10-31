package com.szu.application;

import com.szu.service.SayHelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by kamyang on 2017/10/30.
 */

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        SayHelloService bean = context.getBean(SayHelloService.class);
        String hello = bean.sayHello("YYM");
        System.out.println(hello);
//        System.exit(0);
    }
}
