package com.vishnu.ecommerce.service;

import com.vishnu.ecommerce.model.Order;
import com.vishnu.ecommerce.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepo orderRepo;

	public String createOrder(Order order) {
		orderRepo.save(order);
		return "order saved";
	}

	public Order getOrder(Integer id) {
		return orderRepo.findById(id).orElse(null);
	}
}
