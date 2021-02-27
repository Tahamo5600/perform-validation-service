package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

	

	@Id
	@Column(name = "ADDR_ID")
	Long addressId;
	
	
	@Column(name = "COUNTRY_NAME")
	String counryName;


	public Long getAddressId() {
		return addressId;
	}


	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}


	public String getCounryName() {
		return counryName;
	}


	public void setCounryName(String counryName) {
		this.counryName = counryName;
	}
	
	
	
}
