package com.kaab.demo.controller;
import org.springframework.web.bind.annotation.*;
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String get(){
        return "Kaab islam";
    }
}
