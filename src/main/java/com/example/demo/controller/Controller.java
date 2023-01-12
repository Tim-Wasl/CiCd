package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {
    private int a;
    public String ip_adresse = "192.168.22.22";

    @GetMapping(path = "/test")
    public String hello() {
        return "Hello12";
    }
}
