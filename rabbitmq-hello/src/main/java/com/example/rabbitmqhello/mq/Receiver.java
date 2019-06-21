package com.example.rabbitmqhello.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/5/31 17:00
 **/
@Component
@RabbitListener(queues = "q_topic_messageA")
public class Receiver {
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver :"+hello);
    }
}
