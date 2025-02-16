package com.scalar.productsrevicefeb25.dbinheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_instructor")
public class Instructor extends User {

    private String specialisation;
    private Double avgRating;
}
