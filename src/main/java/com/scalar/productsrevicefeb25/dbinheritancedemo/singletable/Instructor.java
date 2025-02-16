package com.scalar.productsrevicefeb25.dbinheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("1")
public class Instructor extends User {

    private String specialisation;
    private Double avgRating;
}
