package com.example.streamsend;

import com.example.streamsend.stream.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.bind.JAXBContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StreamSendApplication.class)
public class StreamSendApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private Sender sender;
	@Test
	public void testSend(){
		sender.send("2659595");
	}


}
