package com.cg.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.app.entity.Customer;
import com.cg.app.entity.Restaurant;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer>{
	
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(Customer customer);
	public Customer viewCustomer(Customer customer);
	public List<Customer> viewAllCustomers(Restaurant rest);
	

}
