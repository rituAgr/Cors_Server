package com.example.CORS_demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @GetMapping("/get1")
    public String get1(){
        return "GET1 Method Response";
    }

    @PostMapping("/post")
    public String post1(@RequestBody String a){

        return a+"POST1 Method Response";
    }

    @PutMapping("/put")
    public String put1(){
        return "PUT1 Method Response";
    }

    @DeleteMapping("/delete")
    public String del1(){
        return "DELETE1 Method Response";
    }
}
