package xyz.javaneverdie.springbootactivemq.service.impl;

import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import xyz.javaneverdie.springbootactivemq.service.QueueConsumerService;

@Slf4j
@Service
public class QueueConsumerServiceImpl implements QueueConsumerService {
	
	@JmsListener(destination = "${queue-name}")
	public void receiveMessage(TextMessage message) {
		log.info("************Receive message :"+ message);
	}

}