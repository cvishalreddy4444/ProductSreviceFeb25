package com.scalar.productsrevicefeb25.service;

import com.scalar.productsrevicefeb25.models.Product;

import java.util.List;

public interface ProductService {

    public Product getProductbyId(Long id);

    public List<Product> getAllProducts();

}
