package com.petadoption.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@CrossOrigin(origins = "http://localhost:5173")
public class TestController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Backend is running!";
    }
    
    @GetMapping("/cors")
    public String corsTest() {
        return "CORS is working!";
    }
} 