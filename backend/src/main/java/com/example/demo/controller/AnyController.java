package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {

    @GetMapping
    public ResponseEntity<Void> any(){
        return ResponseEntity.ok(null);
    }
}
