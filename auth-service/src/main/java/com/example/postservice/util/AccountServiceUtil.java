package com.example.postservice.util;

import com.example.accountservice.model.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@FeignClient(value = "account-service")
public interface AccountServiceUtil {

    @PostMapping("/account/{userId}/create")
    AccountDTO createAccount(@PathVariable("userId") UUID userId);
}
