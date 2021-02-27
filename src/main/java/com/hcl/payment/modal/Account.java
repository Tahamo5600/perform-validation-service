package com.hcl.payment.modal;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Account {
	@Id
	@Column(name = "ACCOUNT_ID")
	private Long addressId;
	
	@Column(name = "ACC_BAL")
	private String accountBalance;
	
	@Column(name = "ACCT_STATUS")
	private String accountStatus;
}
