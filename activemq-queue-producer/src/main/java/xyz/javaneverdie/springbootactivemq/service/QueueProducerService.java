package xyz.javaneverdie.springbootactivemq.service;

public interface QueueProducerService {
	public void sendMessage(final String message);
	public void sendScheduledMessage();
}
