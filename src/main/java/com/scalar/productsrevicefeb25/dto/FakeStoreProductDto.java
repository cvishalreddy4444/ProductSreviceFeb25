package com.scalar.productsrevicefeb25.dto;

import lombok.Data;

@Data
public class FakeStoreProductDto {

    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;

}
