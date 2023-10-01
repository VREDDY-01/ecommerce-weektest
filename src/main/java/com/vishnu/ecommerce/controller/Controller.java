package com.vishnu.ecommerce.controller;

import com.vishnu.ecommerce.model.Address;
import com.vishnu.ecommerce.model.Order;
import com.vishnu.ecommerce.model.Product;
import com.vishnu.ecommerce.model.User;
import com.vishnu.ecommerce.service.AddressService;
import com.vishnu.ecommerce.service.OrderService;
import com.vishnu.ecommerce.service.ProductService;
import com.vishnu.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	@Autowired
	AddressService addressService;
	@Autowired
	OrderService orderService;
	@PostMapping("users")
	public String createUser(@RequestBody User user){
		return userService.createUser(user);
	}
	@PostMapping("products")
	public String createProduct(@RequestBody Product product){
		return productService.createProduct(product);
	}
	@PostMapping("address")
	public String createAddress(@RequestBody Address address){
		return addressService.createAddress(address);
	}
	@PostMapping("orders")
	public String createOrder(@RequestBody Order order){
		return orderService.createOrder(order);
	}

	@GetMapping("orders/{id}")
	public Order getOrderById(@PathVariable Integer id){
		return orderService.getOrder(id);
	}
	@GetMapping("users/{id}")
	public User getUserById(@PathVariable Integer id){
		return userService.getUser(id);
	}
	@GetMapping("products")
	public List<Product> getProducts(){
		return productService.getProducts();
	}

	@DeleteMapping("products/{id}")
	public String deleteProduct(@PathVariable Integer id){
		return productService.deleteProduct(id);
	}
}
