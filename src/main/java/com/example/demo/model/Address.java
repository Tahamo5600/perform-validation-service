package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	

	@Id
	@Column(name = "ADDR_ID")
	Long addressId;
	
	@Column(name = "H_NO")
	String hno;
	
	@Column(name = "STREET_NAME")
	String streetName;
	
	@Column(name = "CITY")
	String city;
	
	@Column(name = "ZIP")
	Long zip;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}
	
	
	
}
