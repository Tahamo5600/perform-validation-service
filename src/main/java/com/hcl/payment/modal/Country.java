package com.hcl.payment.modal;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Country {

	@Id
	@Column(name = "COUNTRY_ID")
	private Long countryId;
	
	
	@Column(name = "COUNTRY_NAME")
	private String counryName;
}
