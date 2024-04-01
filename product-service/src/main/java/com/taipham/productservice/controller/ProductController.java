package com.taipham.productservice.controller;



import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import com.taipham.productservice.dto.ProductRequest;
import com.taipham.productservice.dto.ProductRespose;
import com.taipham.productservice.service.ProductService;

import java.util.List;

import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductRespose> getAllProducts(){
        return productService.getAllProducts();
    }
    
}
