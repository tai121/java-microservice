package com.taipham.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taipham.productservice.dto.ProductRequest;
import com.taipham.productservice.dto.ProductRespose;
import com.taipham.productservice.model.Product;
import com.taipham.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                            .name(productRequest.getName())
                            .description(productRequest.getDescription())
                            .price(productRequest.getPrice())
                            .build();

        productRepository.save(product);

        log.info("Product {} is saved", product.getId());
    }

    public List<ProductRespose> getAllProducts(){
        List<Product> products = productRepository.findAll();

        return products.stream().map(this::maProductRespose).toList();
    }

    private ProductRespose maProductRespose(Product product){
        return ProductRespose.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

        
    }
}
