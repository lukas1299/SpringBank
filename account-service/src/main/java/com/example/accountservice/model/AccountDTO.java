package com.example.accountservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class AccountDTO {

    private UUID accountId;
    private BigDecimal balance;
}
