package com.nikhil.Jenkins_spring_boot_hello_world.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jenkins")
public class WelcomeController {
    @GetMapping ("/msg")
        public ResponseEntity<String> getWelcomeMsg(){
        return ResponseEntity.ok("Welcome Nikhil!");
        }

}
