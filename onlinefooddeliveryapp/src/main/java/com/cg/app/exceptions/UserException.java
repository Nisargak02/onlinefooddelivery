package com.cg.app.exceptions;

@SuppressWarnings("serial")
public class UserException extends RuntimeException{
	public UserException(String str) {
		super(str);
	}
}
