package xyz.javaneverdie.springbootactivemq.config;

import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class ConfigBean {

	@Value("${topic-name}")
	private String topicName;
	
	@Bean
	public Topic topic() {
		return new ActiveMQTopic(topicName);
	}
}
