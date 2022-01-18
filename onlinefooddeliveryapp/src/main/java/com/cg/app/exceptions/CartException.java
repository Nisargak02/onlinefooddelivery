package com.cg.app.exceptions;

@SuppressWarnings("serial")
public class CartException extends RuntimeException{
	public CartException(String str) {
		super(str);
	}
}
