package com.vishnu.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
	@Id
	private Integer id;
	@OneToOne
	@JoinColumn(name = "userId")
	User user;
	@OneToMany
	@JoinColumn(name = "productId")
	Product product;
	@OneToOne
	@JoinColumn(name = "addressId")
	Address address;
	private Integer quantity;
}
