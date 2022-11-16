package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {
    private int a;
    private transient String b;
    

    @GetMapping(path = "/")
    public String hello() {
        return "Hello";
    }
}
