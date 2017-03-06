package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-3-6.
 */
@RestController
public class HelloWorldController {
    @Autowired
    private Person p;
    @RequestMapping("/hello")
    public String index() {
        return  p.getName() + " " + p.getAge();
    }
}