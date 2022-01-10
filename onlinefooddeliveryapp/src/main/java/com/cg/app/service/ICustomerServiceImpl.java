package com.cg.app.service;

import com.cg.app.entity.Customer;
import com.cg.app.repository.ICustomerRepository;
import com.cg.app.exceptions.CustomerNotFoundException;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

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
		
		return savedCustomer;
	}

	@SuppressWarnings("unused")
	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		
		Optional<Customer> opt=customerRepo.findById(customer.getCustomerId());
		if(opt.isPresent()) {
			Customer existingCustomer=opt.get();
			return customerRepo.save(customer);
		}
		else
		throw new CustomerNotFoundException("Invalid Customer");

	}

	@Override
	public Customer removeCustomer(Integer customerId) throws CustomerNotFoundException{
		
		Optional<Customer> opt=customerRepo.findById(customerId);
		
		if(opt.isPresent()) {
			Customer customer=opt.get(); 
			customerRepo.delete(customer);
			
			return customer;
		}

		throw new CustomerNotFoundException("Invalid Customer");
	}

	@SuppressWarnings("unused")
	@Override
	public Customer viewCustomer(Integer customerId){
		
		Optional<Customer> opt=customerRepo.findById(customerId);
		Customer customer=viewCustomer(customerId);	
		return customer;
		
	}

	@Override
	public List<Customer> viewAllCustomers() {
		
		return customerRepo.findAll();
	}
	
}
