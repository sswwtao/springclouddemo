package com.example.rabbitmqsend.mq;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/5/31 17:31
 **/
@Configuration
public class RabbitConfig {
    final static String messageA = "q_topic_messageA";
    final static String messageB = "q_topic_messageB";
    final static String exchange = "mybootexchange";
    @Bean
    public Queue helloQuene(){
        return new Queue("hello");
    }
    @Bean
    public Queue queueMessageA() {
        return new Queue(RabbitConfig.messageA);
    }

    @Bean
    public Queue queueMessageB() {
        return new Queue(RabbitConfig.messageB);
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange(exchange);
    }
    /**
     * 绑定Q到交换机,并且指定routingKey
     * @param queueMessageA
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue queueMessageA, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessageA).to(exchange).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessageB, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessageB).to(exchange).with("topic.#");
    }
}
