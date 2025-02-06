package com.scalar.productsrevicefeb25.controllers;

import com.scalar.productsrevicefeb25.models.Product;
import com.scalar.productsrevicefeb25.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductbyId(id);
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return product;
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product) {
        return product;
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product) {
        return product;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId) {

    }

}
