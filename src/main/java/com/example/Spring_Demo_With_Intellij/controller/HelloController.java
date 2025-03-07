package com.example.Spring_Demo_With_Intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(Model model){
         model.addAttribute("message" , "Hello from BridgeLabz");
         return "hello";
    }
}
