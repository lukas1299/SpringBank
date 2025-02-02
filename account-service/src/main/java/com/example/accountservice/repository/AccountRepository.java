package com.example.accountservice.repository;

import com.example.accountservice.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findByUserId(UUID userId);

    Optional<Account> findByAccountNumber(String targetAccountNumber);
}
