package com.vishnu.ecommerce.service;

import com.vishnu.ecommerce.model.Address;
import com.vishnu.ecommerce.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	@Autowired
	AddressRepo addressRepo;

	public String createAddress(Address address) {
		addressRepo.save(address);
		return "saved address";
	}
}
