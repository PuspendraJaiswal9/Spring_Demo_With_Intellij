package com.example.Spring_Demo_With_Intellij.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hi")
    public String sayHello(){
        logger.info("INFO: /api/hello endpoint called");
        logger.warn("WARNING: This is a sample warning log");
        logger.error("ERROR: Sample error message");
        return "Hello from BridgeLabz";
    }
}
