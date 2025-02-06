package com.scalar.productsrevicefeb25.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random")
public class SampleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Goodbye!";
    }

}
