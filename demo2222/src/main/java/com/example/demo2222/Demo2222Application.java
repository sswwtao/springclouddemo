package com.example.demo2222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Demo2222Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2222Application.class, args);
	}

}
