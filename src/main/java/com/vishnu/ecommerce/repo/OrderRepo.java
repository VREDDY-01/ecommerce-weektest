package com.vishnu.ecommerce.repo;

import com.vishnu.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
}
