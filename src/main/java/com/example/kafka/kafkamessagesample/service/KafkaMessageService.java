package com.example.kafka.kafkamessagesample.service;

import com.example.kafka.kafkamessagesample.config.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageService {

    @Autowired
    private KafkaProducer producer;

    public void sendMessage(String topic, String message) {
        producer.sendMessage(topic, message);
    }
}
