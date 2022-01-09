package com.cg.app.service;

import com.cg.app.entity.Customer;
import com.cg.app.entity.Restaurant;
import java.util.List;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public Customer removeCustomer(Customer customer);
	
	public Customer viewCustomer(Customer customer);
	
	public List<Customer> viewAllCustomers(Restaurant rest);
	
}
