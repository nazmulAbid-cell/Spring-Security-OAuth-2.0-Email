package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controler {
    @GetMapping("/")
    public String home(){
        return "Home";
    }

    @GetMapping("/secured")
    public String secured(){
        return "secured";
    }
}
