package com.cg.app.exceptions;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException{
	
	public CustomerNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerNotFoundException(String message) {
		super(message);
	}

}
