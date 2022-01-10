package com.cg.app.service;

import com.cg.app.entity.Customer;
import com.cg.app.entity.Restaurant;
import com.cg.app.repository.ICustomerRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ICustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private ICustomerRepository customerRepo;
	@Override
	public Customer addCustomer(Customer customer) {
				
		log.info("Inside the addCustomer method");
		Customer savedCustomer= customerRepo.save(customer);
		log.debug("Customer saved with the ID:"+savedCustomer.getCustomerId());
		
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
