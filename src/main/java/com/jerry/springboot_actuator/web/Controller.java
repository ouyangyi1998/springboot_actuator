package com.jerry.springboot_actuator.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String index(String name)
    {
        return "Hello"+name;
    }
}
