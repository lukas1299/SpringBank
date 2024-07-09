package com.example.transactionservice.controller;

import com.example.transactionservice.service.MessageListener;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MessageController {

    private final MessageListener messageService;



}
