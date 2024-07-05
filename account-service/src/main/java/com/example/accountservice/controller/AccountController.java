package com.example.accountservice.controller;

import com.example.accountservice.model.AccountDTO;
import com.example.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/{userId}")
    public AccountDTO getAccount(@PathVariable("userId") UUID userId){
        return accountService.getUserAccount(userId);
    }

    @PostMapping("/{userId}/create")
    public AccountDTO createAccount(@PathVariable("userId") UUID userId){
        return accountService.createAccount(userId);
    }
}
