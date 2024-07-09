package com.example.transactionservice.service;

import com.example.transactionservice.model.AccountRequest;
import com.example.transactionservice.model.Transaction;
import com.example.transactionservice.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public Transaction createTransaction(AccountRequest accountRequest) {
        return new Transaction(UUID.randomUUID(),
                accountRequest.getFrom(),
                accountRequest.getTargetAccountNumber(),
                new Date(System.currentTimeMillis()),
                accountRequest.getAmount());
    }
}
