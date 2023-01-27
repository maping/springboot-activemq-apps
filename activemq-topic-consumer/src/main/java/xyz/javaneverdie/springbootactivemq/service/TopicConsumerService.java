package xyz.javaneverdie.springbootactivemq.service;

import javax.jms.TextMessage;

public interface TopicConsumerService {
	public void receiveMessage(TextMessage message);
}
