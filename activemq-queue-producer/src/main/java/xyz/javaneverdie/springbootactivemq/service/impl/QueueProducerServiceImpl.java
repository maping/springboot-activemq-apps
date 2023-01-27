package xyz.javaneverdie.springbootactivemq.service.impl;

import java.util.UUID;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import xyz.javaneverdie.springbootactivemq.service.QueueProducerService;

@Slf4j
@Service
public class QueueProducerServiceImpl implements QueueProducerService {

	@Autowired
	private JmsMessagingTemplate jmsQueueTemplate;

	@Autowired
	private Queue queue;

	public void sendMessage(final String message) {
		jmsQueueTemplate.convertAndSend(queue, message + "******" + UUID.randomUUID().toString().substring(0, 6));
	}

	// 定时发送，只有无参方法才可以标注 @Scheduled
	@Scheduled(fixedDelay = 3000)
	public void sendScheduledMessage() {
		jmsQueueTemplate.convertAndSend(queue,
				"Scheduled: ******" + UUID.randomUUID().toString().substring(0, 6));
		log.info("************Scheduled message has been sent successfully************");
	}
}