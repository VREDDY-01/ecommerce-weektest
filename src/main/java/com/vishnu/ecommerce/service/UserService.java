package com.vishnu.ecommerce.service;

import com.vishnu.ecommerce.model.Order;
import com.vishnu.ecommerce.model.User;
import com.vishnu.ecommerce.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

	public String createUser(User user) {
		userRepo.save(user);
		return "saved user";
	}

	public User getUser(Integer id) {
		return userRepo.findById(id).orElse(null);
	}
}
