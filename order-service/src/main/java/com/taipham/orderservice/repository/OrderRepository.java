package com.taipham.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taipham.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
    
}
