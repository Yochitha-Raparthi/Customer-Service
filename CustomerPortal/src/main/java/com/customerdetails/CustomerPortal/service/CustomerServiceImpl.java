package com.customerdetails.CustomerPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerdetails.CustomerPortal.model.Customer;
import com.customerdetails.CustomerPortal.repo.CustomerRepository;

@Service
public  class CustomerServiceImpl implements CustomerService{
	@Autowired
     CustomerRepository customerRepository;
	@Override
     public Customer createCustomer(Customer c) {
    	      return customerRepository.save(c);
     }
	 @Override
	 public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	 }
	 @Override
	 public Customer getCustomer(int id) {
//		return customerRepository.findById(id).orElse(null);
		return customerRepository.findById(id).orElseThrow(() ->
        new RuntimeException("Customer not found"));
	 }
	 
	 @Override
	 public Customer getCustomer(String email) {
		return customerRepository.findByEmail(email);
	 }
	 @Override
	 public Customer updateCustomer(Customer c,int id) {
		 Customer existCustomer= customerRepository.findById(id).orElse(null);
		 if(existCustomer==null) {
			 throw new RuntimeException("customer not found");
		 }
		 if(c.getName()!=null) {
			 existCustomer.setName(c.getName());
		 }
		 if(c.getCity()!=null) {
			 existCustomer.setCity(c.getCity());
		 }
		 if(c.getEmail()!=null) {
			 existCustomer.setEmail(c.getEmail());
		 }
		 if(c.getPhone()!=null) {
			 existCustomer.setPhone(c.getPhone());
		 }
		 if(c.getState()!=null) {
			 existCustomer.setState(c.getState());
		 }
		 return customerRepository.save(existCustomer);
	 }
	 @Override
	 public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
		
	 }
}
