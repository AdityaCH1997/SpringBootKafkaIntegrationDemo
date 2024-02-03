package com.example2.SpringBootKafkaIntegrationDemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic apacheKafkaSpringBootGuidesTopic() {
		
		return TopicBuilder.name("testTopic2").build();
		
	}
	
	public NewTopic apacheKafkaSpringBootGuidesTopicJson() {
		return TopicBuilder.name("testTopic2_json").build();
	}

}
