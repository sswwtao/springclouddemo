package com.example.streamsend;

import com.example.streamsend.stream.Sender;
import com.example.streamsend.stream.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StreamSendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamSendApplication.class, args);
	}

	@Autowired
	private Sender sender;

	@RequestMapping("/send")
	public String send(String message){
		sender.send(message);
		return "ok";
	}



}
