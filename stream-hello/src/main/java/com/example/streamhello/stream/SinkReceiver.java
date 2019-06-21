package com.example.streamhello.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/6/4 14:37
 **/
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(String payload){
        logger.info("Received: "+payload);

    }
}
