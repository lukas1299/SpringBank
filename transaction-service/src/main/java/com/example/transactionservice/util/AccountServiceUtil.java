package com.example.transactionservice.util;

import com.example.transactionservice.model.AccountDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@FeignClient(value = "account-service")
public interface AccountServiceUtil {

    @PostMapping("/account/{userId}/transaction")
    AccountDTO createAccount(@PathVariable("userId") UUID userId);

    @PatchMapping("/account")
    AccountDTO updateAccount(@RequestParam String targetAccountNumber, @RequestParam BigDecimal amount, @RequestParam String operation);

    @GetMapping("/{userId}")
    AccountDTO getAccount(@PathVariable("userId") UUID userId);
}
