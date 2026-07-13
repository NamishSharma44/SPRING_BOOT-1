package com.namish.demo.Server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloServer {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
