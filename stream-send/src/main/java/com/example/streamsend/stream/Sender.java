package com.example.streamsend.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/6/10 17:24
 **/
@Component
@EnableBinding(StreamClient.class)
public class Sender {
    private Logger logger = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private StreamClient streamClient;

    @StreamListener(StreamClient.OUTPUT)
    public void send(String message){
        Message message1 = MessageBuilder.withPayload(message).build();
        streamClient.output().send(message1);

    }

}
