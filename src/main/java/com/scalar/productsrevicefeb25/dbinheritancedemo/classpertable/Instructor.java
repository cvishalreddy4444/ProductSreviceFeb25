package com.scalar.productsrevicefeb25.dbinheritancedemo.classpertable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_instructor")
public class Instructor extends User {

    private String specialisation;
    private Double avgRating;
}
