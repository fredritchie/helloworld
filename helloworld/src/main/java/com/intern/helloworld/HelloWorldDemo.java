package com.intern.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDemo {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
}
