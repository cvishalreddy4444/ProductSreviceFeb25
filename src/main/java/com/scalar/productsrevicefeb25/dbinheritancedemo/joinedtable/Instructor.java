package com.scalar.productsrevicefeb25.dbinheritancedemo.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_instructor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User {

    private String specialisation;
    private Double avgRating;
}
