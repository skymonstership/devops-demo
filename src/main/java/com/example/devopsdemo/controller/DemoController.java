package com.example.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple REST controller for DevOps demo
 */
@RestController
public class DemoController {

    /**
     * Hello endpoint - returns a simple message
     * This endpoint will be tested by our CI pipeline
     */
    @GetMapping("/hello")
    public String hello() {
        return "DevOps demo application is running!";
    }
}