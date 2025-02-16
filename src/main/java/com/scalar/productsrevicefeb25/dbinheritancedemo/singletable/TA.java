package com.scalar.productsrevicefeb25.dbinheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@DiscriminatorValue("3")
public class TA extends User {

    private int numberOfHRs;

}
