package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {
    

    @GetMapping(path = "/test")
    public String hello() {
        return "Hello12";
    }

    @GetMapping(path = "/test1")
    public String hello1() {
        return "Hello123";
    }
}
