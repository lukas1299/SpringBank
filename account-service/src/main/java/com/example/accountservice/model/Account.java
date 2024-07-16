package com.example.accountservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private String accountNumber;
    private UUID userId;
    private BigDecimal balance;

}
