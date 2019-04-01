package com.example.springclouddemo.conroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/3/31 14:54
 **/
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping("hello")
    public String index(){
        return "Hello World";
    }
}
