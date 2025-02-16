package com.scalar.productsrevicefeb25.service.impl;

import com.scalar.productsrevicefeb25.exceptions.ProductNotFoundException;
import com.scalar.productsrevicefeb25.models.Product;
import com.scalar.productsrevicefeb25.repository.ProductRepository;
import com.scalar.productsrevicefeb25.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelfProductService implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getProductbyId(Long id) throws ProductNotFoundException {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
