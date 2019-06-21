package com.example.streamreceive.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @Description TODO
 * @Author sunlongtao
 * @Date 2019/6/10 17:24
 **/
@EnableBinding(StreamClient.class)
public class StreamReceiver {
    private Logger logger = LoggerFactory.getLogger(StreamReceiver.class);

    @StreamListener(StreamClient.INPUT)
    public void receive(String message){
        logger.info("StreamReceiver:{}",message);
    }

}
