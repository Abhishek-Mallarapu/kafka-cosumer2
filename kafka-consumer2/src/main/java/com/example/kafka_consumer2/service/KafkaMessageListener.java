package com.example.kafka_consumer2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    // Using SLF4J Logger instead of java.util.logging.Logger
    private static final Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "Abhi-demo", groupId = "new-group")
    public void consumer(String message) {
        // Log the message with SLF4J
        log.info("consumer1 consumed the message: {}", message);
    }
}
