package com.phucvo.gitaction;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class WelcomeController {

    @PostConstruct
    public void welcome() {
        System.out.println("Welcome to git action!!");
    }
}
