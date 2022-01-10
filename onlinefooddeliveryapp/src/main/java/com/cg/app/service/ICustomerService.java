package com.cg.app.service;

import com.cg.app.entity.Customer;
import java.util.List;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(Integer customerId);
	public Customer viewCustomer(Integer customerId);
	public List<Customer> viewAllCustomers();
	
}
