package com.example2.SpringBootKafkaIntegrationDemo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import com.example2.SpringBootKafkaIntegrationDemo.model.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics = "testTopic2_json", groupId = "group1")
	public void consumeMessage(Message<User> data) {
		User message = data.getPayload();
		LOGGER.info(String.format("Message consumed by JSON Kafka Listener: %s",message.toString()));
	}
	
	
}
