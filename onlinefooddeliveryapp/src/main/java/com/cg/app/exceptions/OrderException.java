package com.cg.app.exceptions;

@SuppressWarnings("serial")
public class OrderException extends RuntimeException{
	public OrderException(String str) {
		super(str);
	}
}
