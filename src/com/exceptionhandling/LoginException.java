package com.exceptionhandling;

public class LoginException extends Exception{
	
	String message;

	public LoginException(String message) {
		super(message);
		
	}

	@Override
	public String toString() {
		return "LoginException [message=" + message + "]";
	}

	

	
	
	
	
	
	

}
