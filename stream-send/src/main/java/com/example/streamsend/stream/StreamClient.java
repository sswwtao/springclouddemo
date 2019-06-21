package com.example.streamsend.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {
    String OUTPUT = "myOutput";


    @Output(StreamClient.OUTPUT)
    MessageChannel output();
}