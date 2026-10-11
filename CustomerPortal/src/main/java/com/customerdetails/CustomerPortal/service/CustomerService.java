package com.customerdetails.CustomerPortal.service;
import java.util.List;
import com.customerdetails.CustomerPortal.model.Customer;

public interface CustomerService {

	public abstract Customer createCustomer(Customer c);
	public abstract List<Customer> getAllCustomers();
	public abstract Customer getCustomer(int id);
	public abstract Customer updateCustomer(Customer c,int id);
	public abstract void deleteCustomer(int id);
	public abstract Customer getCustomer(String email);
}
