package com.example.Services;

import com.example.Constants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {

	@KafkaListener(topics = Constants.topic_name, groupId = Constants.group_name)
	public void getMessage(String messageReceived) {
		System.out.println("Received Message is: " + messageReceived);
	}
}
