package com.example2.SpringBootKafkaIntegrationDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example2.SpringBootKafkaIntegrationDemo.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	@Autowired
	private KafkaProducer kafkaProducer;
	
	@GetMapping("/getMessage")
	public String getMessage() {
		
		return null;
	}
	
	//http://localhost:8080/api/v1/kafka/publish?message=Hello
	@GetMapping("/publish") 
	public ResponseEntity<String> putMessage(@RequestParam("message") String message) {
		
		kafkaProducer.sendMessage(message);
		
		//return ResponseEntity.ok("Message sent successfully");
		return ResponseEntity.status(HttpStatus.OK).body("Message sent successfully through the Kafka"
				+ " Producer to the Kafka Topic");
	}
}
