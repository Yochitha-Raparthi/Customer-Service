package com.customerdetails.CustomerPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerdetails.CustomerPortal.model.Customer;
import com.customerdetails.CustomerPortal.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:5173")
public  class CustomerController{
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/create")
	Customer createCustomerInData(@RequestBody Customer c) {
		return customerService.createCustomer(c);
	}
	@GetMapping("/all")
    List<Customer>getAllCustomers(){
    	      return customerService.getAllCustomers();
    }
	
	@GetMapping("/getCustomer/id/{id}")
	Customer getCustomer(@PathVariable Integer id) {
		return customerService.getCustomer(id);
	}
	
	@PutMapping("/update/{id}")
	Customer updateCustomer(@RequestBody Customer c,@PathVariable Integer id) {
		return customerService.updateCustomer(c, id);
	}
	
	@PatchMapping("/updateCustomer/{id}")
	Customer patchCustomer(@RequestBody Customer c,@PathVariable Integer id) {
		return customerService.updateCustomer(c, id);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
		return "customer "+id+" deleted";
	}
	
	@GetMapping("/getCustomer/email/{email}")
	Customer getCustomer(@PathVariable String email) {
		return customerService.getCustomer(email);
	}
	
}
