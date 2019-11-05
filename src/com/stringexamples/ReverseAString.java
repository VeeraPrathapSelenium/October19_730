package com.stringexamples;

public class ReverseAString {

	public static void main(String[] args) {
		
		String temp="";
		String data="Welcome to Selenium Training";
		
		for(int i=data.length()-1;i>=0;i--)
		{
			temp=temp+data.charAt(i);
			
		}
		
		System.out.println(temp);
		

	}

}
