package com.cg.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.entity.Customer;
import com.cg.app.service.ICustomerService;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@SuppressWarnings("unused")
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomerHandler(@RequestBody Customer customer) {
		
		log.info("Inside addCustomerHandler of controller class...");
		Customer savedCustomer=customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
		
	}
	
	@PostMapping("/updateCustomer")
	public Customer updateCustomerHandler(@RequestBody Customer customer) {
		
		log.info("Inside updateCustomerHandler of controller class...");
		
		return customerService.updateCustomer(customer);
	}
	
	@PostMapping("/removeCustomer")
	public Customer removeCustomerHandler(@RequestBody Integer customerId) {
		
		log.info("Inside removeCustomerHandler of controller class...");
		
		return customerService.removeCustomer(customerId);
	}
	
	@PostMapping("/viewCustomer")
	public Customer viewCustomerHandler(@RequestBody Integer customerId) {
		
		log.info("Inside viewCustomerHandler of controller class...");
		
		return customerService.viewCustomer(customerId);
	}
	
	@PostMapping("/viewAllCustomer")
	public List<Customer> viewAllCustomerHandler(@RequestBody Integer customerId) {
		
		log.info("Inside viewAllCustomerHandler of controller class...");
		
		return customerService.viewAllCustomers();
	}
}
