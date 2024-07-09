package com.example.transactionservice.service;

import com.example.transactionservice.config.RabbitMQConfig;
import com.example.transactionservice.model.Email;
import com.example.transactionservice.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {

    //private final TransactionRepository transactionRepository;

    private final RabbitTemplate rabbitTemplate;

    public String createTransaction(){

        Email mess = new Email("Mess", "INFO");
        rabbitTemplate.convertAndSend(RabbitMQConfig.queueName, mess);
        return mess.toString();
    }

}
