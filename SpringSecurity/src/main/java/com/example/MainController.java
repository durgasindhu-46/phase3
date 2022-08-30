package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Welcome to Our site";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Welcome user, i was protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello! from admin";
    }

}
