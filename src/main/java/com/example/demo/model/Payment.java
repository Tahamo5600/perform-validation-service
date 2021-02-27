package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@Column(name = "PMT_ID")
	Long paymentId;
	
	@Column(name = "PAYMENT_AMT")
	String paymentAmount;
	
	@Column(name = "CREDIT_ID")
	String creditId;
	
	@Column(name = "DEBIT_ID")
	String debitId;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getCreditId() {
		return creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public String getDebitId() {
		return debitId;
	}

	public void setDebitId(String debitId) {
		this.debitId = debitId;
	}

	
	
}
