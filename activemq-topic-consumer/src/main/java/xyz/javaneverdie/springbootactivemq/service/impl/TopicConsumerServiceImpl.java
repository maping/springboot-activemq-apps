package xyz.javaneverdie.springbootactivemq.service.impl;

import java.util.UUID;

import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import xyz.javaneverdie.springbootactivemq.service.TopicConsumerService;

@Slf4j
@Service
public class TopicConsumerServiceImpl implements TopicConsumerService {

	@JmsListener(destination = "${topic-name}")
	public void receiveMessage(TextMessage message) {
		log.info("************Receive message :"+ message);
	}

}