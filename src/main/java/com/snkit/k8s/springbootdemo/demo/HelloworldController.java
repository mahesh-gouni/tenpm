package com.snkit.k8s.springbootdemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping(value = "/dockerDemo")
    public String helloWorld(){
        System.out.println("hello");
        return " CI demo now to demo ci";
    }
}
