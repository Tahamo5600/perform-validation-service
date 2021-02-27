package com.hcl.payment.modal;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Payment {

	@Id
	@Column(name = "PMT_ID")
	private Long paymentId;
	
	@Column(name = "PAYMENT_AMT")
	private String paymentAmount;
	
	@Column(name = "CREDIT_ID")
	private String creditId;
	
	@Column(name = "DEBIT_ID")
	private String debitId;
}
