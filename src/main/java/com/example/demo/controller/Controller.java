package com.example.demo.controller;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {
    private int a;
    String ip = "192.168.12.42";
    @NonNull
    private String b = null;

    @GetMapping(path = "/test")
    public String hello() {
        return "Hello12";
    }

    @GetMapping(path = "/test1")
    public String hello1() {
        return "Hello123";
    }
}
