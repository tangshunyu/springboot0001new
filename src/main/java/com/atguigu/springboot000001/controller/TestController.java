package com.atguigu.springboot000001.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: tangshunyu
 * @Date: 2019/3/21
 * @Description:
 * @version: 1.0
 */
@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/helloworld")
    public String helloWorld(int i){
        logger.info("hello world");
        int j = 1/i;
        System.out.println(j);
        return "hello world";
    }

}
