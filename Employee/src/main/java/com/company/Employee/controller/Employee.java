package com.company.Employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	@RequestMapping("/name")
     String name() {
    	    return "welocme";
     }
}
