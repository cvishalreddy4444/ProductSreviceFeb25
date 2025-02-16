package com.scalar.productsrevicefeb25.service;

import com.scalar.productsrevicefeb25.exceptions.ProductNotFoundException;
import com.scalar.productsrevicefeb25.models.Product;

import java.util.List;

public interface ProductService {

    public Product getProductbyId(Long id) throws ProductNotFoundException;

    public List<Product> getAllProducts();

}
