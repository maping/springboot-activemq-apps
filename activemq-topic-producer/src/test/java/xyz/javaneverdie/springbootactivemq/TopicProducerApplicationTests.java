package xyz.javaneverdie.springbootactivemq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;
import xyz.javaneverdie.springbootactivemq.service.TopicProducerService;

@Slf4j
@SpringBootTest
@WebAppConfiguration
class TopicProducerApplicationTests {

	@Autowired
	TopicProducerService topicProducerService;
	
	@Test
	void contextLoads() {
		topicProducerService.sendMessage("Hi Forrest, How are you?");
		log.info("************Message has been sent successfully************");
	}

}
