package com.scalar.productsrevicefeb25.models;

import lombok.Data;

import java.util.Date;

@Data
public class Product extends BaseModel {

    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private Category category;

}
