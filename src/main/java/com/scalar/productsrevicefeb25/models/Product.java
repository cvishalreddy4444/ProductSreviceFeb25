package com.scalar.productsrevicefeb25.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "products")
public class Product extends BasePojo {

    private String title;
    private String description;
    private String imageUrl;
    private double price;
    @ManyToOne
    private Category category;

}
