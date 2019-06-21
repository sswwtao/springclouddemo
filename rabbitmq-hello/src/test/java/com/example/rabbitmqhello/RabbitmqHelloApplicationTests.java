package com.example.rabbitmqhello;

import com.example.rabbitmqhello.mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitmqHelloApplication.class)
public class RabbitmqHelloApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private Sender sender;
	@Test
	public void hello(){
		sender.send();
	}

}
