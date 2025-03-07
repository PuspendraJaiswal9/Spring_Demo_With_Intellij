package com.example.Spring_Demo_With_Intellij.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hi")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
