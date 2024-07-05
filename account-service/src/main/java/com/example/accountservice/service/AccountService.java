package com.example.accountservice.service;

import com.example.accountservice.model.Account;
import com.example.accountservice.model.AccountDTO;
import com.example.accountservice.repository.AccountRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountDTO createAccount(UUID userId) {

        Account account = accountRepository.save(
                new Account(UUID.randomUUID(),
                        userId,
                        BigDecimal.ZERO));
        return convertAccountToDto(account);
    }

    public AccountDTO getUserAccount(UUID userId){

        Account account = accountRepository.findByUserId(userId).orElseThrow(EntityNotFoundException::new);
        return convertAccountToDto(account);
    }

    private AccountDTO convertAccountToDto(Account account){
        return new AccountDTO(account.getId(), account.getBalance());
    }
}
