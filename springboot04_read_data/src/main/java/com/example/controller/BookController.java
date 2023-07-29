package com.example.controller;

import com.example.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Value("${lesson}")
    private String lesson;

    @Value("${server.port}")
    private String port;

    @Value("${enterprise.subject[0]}")
    private String subject_0;

    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;


    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(lesson);
        System.out.println("----------");
        System.out.println(environment.getProperty("server.port"));
        System.out.println("----------");
        System.out.println(enterprise);

        return "hello, springboot";
    }
}
