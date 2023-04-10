package com.husseinabdallah.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jenkins/")
public class Controller {


    @GetMapping("/greeting")
    public String hello(){
        return "hello world";
    }
}
