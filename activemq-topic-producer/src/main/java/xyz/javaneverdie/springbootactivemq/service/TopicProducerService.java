package xyz.javaneverdie.springbootactivemq.service;

public interface TopicProducerService {
	public void sendMessage(final String message);
	public void sendScheduledMessage();
}
