package com.stringmethods;

public class Trim {

	public static void main(String[] args) {

		String data="          Hello india           ";
		
		System.out.println("The length of the  string before trim :"+data.length());
		
		data=data.trim();
		
		System.out.println("The length of the string after trim :"+data.length());
		
		

	}

}
