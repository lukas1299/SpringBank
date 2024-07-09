package com.example.accountservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class AccountRequest implements Serializable {

    private final String serialVersionUID = "41341as12";
    private UUID from;
    private String targetAccountNumber;
    private BigDecimal amount;

    @Override
    public String toString() {
        return "AccountRequest{" +
                "from=" + from +
                ", targetAccountNumber='" + targetAccountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
