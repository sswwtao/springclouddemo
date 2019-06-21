package com.example.streamreceive.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {
    String INPUT = "myInput";


    @Input(StreamClient.INPUT)
    SubscribableChannel input();
}