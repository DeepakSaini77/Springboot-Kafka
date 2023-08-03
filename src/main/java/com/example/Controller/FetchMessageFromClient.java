package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.KafkaProducer;
@RestController
public class FetchMessageFromClient {

	@Autowired
    KafkaProducer kafkaProducer;


    @GetMapping(value = "/produceMsg")
    public String sendMessage(@RequestParam("message") String message)
    {
        kafkaProducer.sendMessageToTopic(message);
        return "The following message is send successfully:"+message;
    }
	
}
