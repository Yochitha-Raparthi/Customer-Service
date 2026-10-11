package com.customerdetails.CustomerPortal.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerdetails.CustomerPortal.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Customer findByEmail(String email);

}
