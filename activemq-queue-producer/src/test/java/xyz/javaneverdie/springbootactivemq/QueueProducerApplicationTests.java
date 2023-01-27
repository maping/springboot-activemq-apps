package xyz.javaneverdie.springbootactivemq;

import javax.jms.Queue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;
import xyz.javaneverdie.springbootactivemq.service.QueueProducerService;

@Slf4j
@SpringBootTest
@WebAppConfiguration
class QueueProducerApplicationTests {

	@Autowired
	QueueProducerService queueProducerService;
	
	@Test
	void contextLoads() {
		queueProducerService.sendMessage("Hi Forrest, How are you?");
		log.info("************Message has been sent successfully************");
	}

}
