package com.example.transactionservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@RequiredArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private UUID fromAccount;
    private UUID toAccount;
    private Date createDate;
    private BigDecimal amount;

}
