package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {
    private int a;
    private transient String b;
    public static final String IP_ADRESS = "http://127.0.0.1:4200";
    

    @GetMapping(path = "/test")
    public String hello() {
        return "Hello12";
    }

    @GetMapping(path = "/test1")
    public String hello1() {
        return "Hello123";
    }
}
