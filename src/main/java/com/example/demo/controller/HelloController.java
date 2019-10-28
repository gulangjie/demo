package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value="hello")
    public String hello(){
        String retStr = "Hello Spring_boot";
        return retStr;
    }
}
