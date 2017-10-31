package com.szu.controler;

import com.szu.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kamyang on 2017/11/1.
 */
@RestController
public class SayHelloControler {

    @Autowired
    private SayHelloService sayHelloService;

    @RequestMapping(value = "/api")
    public String sayHello(@RequestParam(defaultValue = "SpringBoot") String name) {
        return sayHelloService.sayHello(name);
    }
}
