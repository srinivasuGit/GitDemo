package com.example.gitdemo.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public String sayHello(){
        return "Hello Welcome !!!";
    }

    @GetMapping("/{name}")
    public String welcomeMessage(@PathParam("name") String name){
        return "Welcome" +name;
    }
}
