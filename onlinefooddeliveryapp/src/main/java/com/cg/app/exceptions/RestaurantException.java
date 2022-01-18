package com.cg.app.exceptions;

@SuppressWarnings("serial")
public class RestaurantException extends RuntimeException{
	public RestaurantException(String str) {
		super(str);
	}
}