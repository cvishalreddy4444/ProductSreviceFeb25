package com.scalar.productsrevicefeb25.dbinheritancedemo.classpertable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_ta")
public class TA extends User {

    private int numberOfHRs;

}
