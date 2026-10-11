package com.hello.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApplication {
	@RequestMapping("/hello")
    String hello() {
    	    return "Hello Guys Welcome to Vcube";
    }
}
