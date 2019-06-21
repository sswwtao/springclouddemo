package com.example.rabbitmqhello.mq;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/5/31 17:31
 **/
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQuene(){
        return new Queue("q_topic_messageBB");
    }
}
