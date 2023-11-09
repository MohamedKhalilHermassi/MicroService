package com.example.msproject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatRestAPI {
    private String title="Hello, i'm the candidate Micro-Service";
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
}
