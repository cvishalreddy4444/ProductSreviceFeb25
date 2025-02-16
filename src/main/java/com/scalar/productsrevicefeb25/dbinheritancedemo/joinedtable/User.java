package com.scalar.productsrevicefeb25.dbinheritancedemo.joinedtable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
