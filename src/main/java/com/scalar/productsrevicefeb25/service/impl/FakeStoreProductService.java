package com.scalar.productsrevicefeb25.service.impl;

import com.scalar.productsrevicefeb25.dto.FakeStoreProductDto;
import com.scalar.productsrevicefeb25.models.Category;
import com.scalar.productsrevicefeb25.models.Product;
import com.scalar.productsrevicefeb25.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {

    @Autowired
    private RestTemplate restTemplate;
    //Make a call to fake store service and get product
    @Override
    public Product getProductbyId(Long id) {
        FakeStoreProductDto fakeStoreProductDto=  restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreProductDto.class);

        //convert FakeStoreProductDto to Product
        if(fakeStoreProductDto!=null){
            return convertDtoToProduct(fakeStoreProductDto);
        }

        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto [] list=  restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreProductDto[].class);
        System.out.println(Arrays.spliterator(list).toString());
        List<Product> plist = new ArrayList<>();
        //convert FakeStoreProductDto to Product
        for(FakeStoreProductDto fakeStoreProductDto: list){
            plist.add(convertDtoToProduct(fakeStoreProductDto));
        }
        return plist;
    }

    private static Product convertDtoToProduct(FakeStoreProductDto fakeStoreProductDto) {
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setCategory(new Category());
        product.getCategory().setValue(fakeStoreProductDto.getCategory());
        product.setDescription(fakeStoreProductDto.getDescription());
        return product;
    }
}
