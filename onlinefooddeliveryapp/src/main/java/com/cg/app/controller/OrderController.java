package com.cg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.app.entity.Category;
import com.cg.app.entity.Customer;
import com.cg.app.entity.OrderDetails;
import com.cg.app.service.IOrderService;

public class OrderController {
	
	@Autowired
	IOrderService orderService;
	
	@PostMapping("/register")
	public ResponseEntity<OrderDetails> addOrder(@RequestBody OrderDetails order ) {
		
		OrderDetails orders = orderService.addOrder(order);
		
		return new ResponseEntity<OrderDetails>(orders,HttpStatus.OK);
		
	}
	

	@PutMapping("/update")
	public ResponseEntity<OrderDetails> updateOrder(@RequestBody OrderDetails order ){
	
		OrderDetails orders = orderService.updateOrder(order);
		 
			return new ResponseEntity<OrderDetails>(orders,HttpStatus.OK);
		
	}
	@DeleteMapping("/remove/{oid}")
	public OrderDetails removeOrder(@PathVariable("oid") integer oId) {
		
		return  orderService.removeOrder(oId);
		
	}
	@GetMapping("/view/{catName}")
	public ResponseEntity<OrderDetails> viewOrder(@PathVariable("catName") String catName){
		
		OrderDetails orders= orderService.viewOrder(catName);
		 
			return new ResponseEntity<OrderDetails>(orders,HttpStatus.OK);
		
	}
	@GetMapping("/viewall")
	public List<OrderDetails> viewAllOrders(){
		
		return orderService.viewAllOrders();
		
		
	}
	

}
