package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    @GetMapping("/home")
    public String getHome(){
        return "HOME";
    }
    @GetMapping("/hello-world")
    public String getGreeting(){
        return "Hello World";
    }
}
