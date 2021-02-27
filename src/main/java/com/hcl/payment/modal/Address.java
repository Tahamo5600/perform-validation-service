package com.hcl.payment.modal;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Address {

	@Id
	@Column(name = "ADDR_ID")
	private Long addressId;
	
	@Column(name = "H_NO")
	private String hno;
	
	@Column(name = "STREET_NAME")
	private String streetName;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "ZIP")
	private Long zip;
}
