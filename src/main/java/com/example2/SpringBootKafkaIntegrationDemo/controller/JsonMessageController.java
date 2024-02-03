package com.example2.SpringBootKafkaIntegrationDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.SpringBootKafkaIntegrationDemo.kafka.JsonKafkaProducer;
import com.example2.SpringBootKafkaIntegrationDemo.model.User;

@RestController
@RequestMapping("api/v1/kafka")
public class JsonMessageController {

	@Autowired
	JsonKafkaProducer kafkaProducer;
	
	@PostMapping("/publishJson")
	public ResponseEntity<String> putMessage(@RequestBody User data) {
		kafkaProducer.sendMessage(data);
		
		return ResponseEntity.status(HttpStatus.OK).body("Json message sent successfully to" + 
		"Json Kafka Producer");
	}
	
}
