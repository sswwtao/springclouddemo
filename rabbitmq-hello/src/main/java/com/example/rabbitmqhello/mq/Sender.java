package com.example.rabbitmqhello.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/5/31 16:54
 **/
//@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String content = "hello "+ new Date();
        System.out.println(content);
        this.rabbitTemplate.convertAndSend("hello",content);
    }
}
