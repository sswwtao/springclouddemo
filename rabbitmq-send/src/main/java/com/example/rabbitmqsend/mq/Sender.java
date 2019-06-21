package com.example.rabbitmqsend.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/5/31 16:54
 **/
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String content = "hello "+ new Date();
        System.out.println(content);
        //简单对列的情况下routingKey即为Q名
        this.rabbitTemplate.convertAndSend("hello",content);
    }
    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("mybootexchange", "topic.message", context);
    }


    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("mybootexchange", "topic.messages", context);
    }

    public void sendFanout(){
        String context = "hi, fanout msg ";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("mybootfanoutExchange","", context);
    }
}
