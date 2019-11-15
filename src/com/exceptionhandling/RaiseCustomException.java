package com.exceptionhandling;

import javax.security.auth.login.LoginException;

public class RaiseCustomException {

	public static void main(String[] args) throws LoginException {

String expUsername="abac";

if(!expUsername.equals("abc"))
{
	throw new LoginException("You cant not enter wrong username");
}



		
		

	}

}
