package xyz.javaneverdie.springbootactivemq.service;

import javax.jms.TextMessage;

public interface QueueConsumerService {
	public void receiveMessage(TextMessage message);
}
