package com.example.feignconsumer.controller;

import com.example.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/5/27 15:03
 **/
@RestController
public class ConSumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return "feign-consumer:"+ helloService.hello();
    }
}
