package com.cg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.entity.Customer;
import com.cg.app.service.ICustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	
	@PostMapping("/addCustomer")
	public Customer registerCustomerHandler(@RequestBody Customer customer) {
		
		log.info("Inside addCustomerHandler of controller class...");
			
		return customerService.addCustomer(customer);
		
	}
	
	
}
