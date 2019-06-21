package com.example.rabbitmqsend;

import com.example.rabbitmqsend.mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitmqSendApplication.class)
public class RabbitmqSendApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Autowired
	private Sender sender;

	@Test
	public void hello() {
		for(int i=0;i<100;i++){
			sender.send();
		}
	}
	@Test
	public void send1(){
		sender.send1();
	}
	@Test
	public void send2(){
		for(int i=0;i<10;i++){
			sender.send2();
		}
	}
	@Test
	public void sendFanout(){
		sender.sendFanout();
	}
}