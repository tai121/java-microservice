package com.taipham.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.taipham.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    
}
