package com.hcl.payment.modal;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TransactionEntity {

    @Id
    @Column(name = "transaction_id")
    private Long transactionId;

    private Account account;

    private Address address;

    private Country country;

    private Payment payment;
}
