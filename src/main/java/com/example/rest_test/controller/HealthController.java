package com.example.rest_test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok().body("pong");
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(@RequestParam(required = true) String test){
        return ResponseEntity.ok().body("pong");
    }
}
