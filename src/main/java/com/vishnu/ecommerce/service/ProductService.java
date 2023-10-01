package com.vishnu.ecommerce.service;

import com.vishnu.ecommerce.model.Product;
import com.vishnu.ecommerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;

	public String createProduct(Product product) {
		productRepo.save(product);
		return "saved product";
	}

	public List<Product> getProducts() {
		return productRepo.findAll();
	}

	public String deleteProduct(Integer id) {
		productRepo.deleteById(id);
		return "product deleted";
	}
}

