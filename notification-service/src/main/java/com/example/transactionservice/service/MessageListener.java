package com.example.transactionservice.service;

import com.example.transactionservice.model.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "emails")
    public void listen(Email email){
        prepareEmailToSend(email);
    }

    private String prepareEmailToSend(Email email){

        return switch (email.getType()) {
            case "INFO" -> sentInformationEmail(email.getMessage());
            case "ACCEPT_TRANSACTION" -> sentAcceptTransactionEmail(email.getMessage());
            default -> "TYPE-ERROR";
        };
    }

    private String sentInformationEmail(String mess){
        return "INFO-EMAIL";
        // sent information email
    }

    private String sentAcceptTransactionEmail(String mess){
        return "ACCEPT-EMAIL";
    }

}
