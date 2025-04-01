package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Value("${spring.application.name}")
    private String name;
    @RequestMapping("/")
    public String index() {
        System.out.println(name);
        return "button.html";
    }
}
