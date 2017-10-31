package com.szu.application;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by kamyang on 2017/11/1.
 */
@Configuration
@ImportResource(value = {"classpath:spring/application.xml"})
public class DubboConfig {
}
