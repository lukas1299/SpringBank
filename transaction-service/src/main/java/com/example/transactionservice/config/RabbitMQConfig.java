package com.example.transactionservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String queueName = "emails";

    @Bean
    Queue myQueue(){
        return new Queue(queueName, true);
    }

}
