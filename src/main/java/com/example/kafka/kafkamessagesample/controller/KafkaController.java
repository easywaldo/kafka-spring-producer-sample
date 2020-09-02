package com.example.kafka.kafkamessagesample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class KafkaController {
    @Autowired
    KafkaTemplate kafkaTemplate;

    @RequestMapping(method = RequestMethod.GET, path = "/send")
    public String send() {
        kafkaTemplate.send("test_topic_17", "hello_world");
        return "Kafka Produce!!!";
    }
}
