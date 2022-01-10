package com.cg.app.service;

import com.cg.app.entity.Customer;
import com.cg.app.entity.Restaurant;
import com.cg.app.repository.ICustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ICustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustomerRepository customerRepo;
	@Override
	public Customer addCustomer(Customer customer) {
		customerRepo.save(customer);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewAllCustomers(Restaurant rest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
