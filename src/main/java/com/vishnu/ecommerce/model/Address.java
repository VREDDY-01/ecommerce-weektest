package com.vishnu.ecommerce.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Address {
	private Integer id;
	private String name;
	private String landmark;
	private String phoneNumber;
	private String zipcode;
	private String state;
	@OneToOne
	@JoinColumn(name = "userId")
	User user;
}
