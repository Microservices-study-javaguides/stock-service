package org.whisky.stockservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.whisky.basedomain.dto.OrderEvent;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderConsumer
{
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent orderEvent) {
        log.info("Order event received -> {}", orderEvent.toString());
        // save the order event into the database
    }
}
