package com.scalar.productsrevicefeb25.dbinheritancedemo.mappedsuperclass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass()
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
