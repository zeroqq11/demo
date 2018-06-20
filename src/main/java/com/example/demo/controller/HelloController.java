package com.example.demo.controller;

import com.example.demo.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Greeting greeting() {
        Greeting g = new Greeting();
        g.setId(1);
        g.setContent("jenkins auto build test! hahahaha");
        return g;
    }
}
