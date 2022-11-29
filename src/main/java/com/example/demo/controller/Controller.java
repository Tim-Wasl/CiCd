package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {
    private int a;
    private transient String b;
    

    @GetMapping(path = "/test")
    public String hello() {
        return "Hello";
    }

    @GetMapping(path = "/test1")
    public String hello1() {
        return "Test1";
    }
}
