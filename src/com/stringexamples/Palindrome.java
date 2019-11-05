package com.stringexamples;

public class Palindrome {

	public static void main(String[] args) {
		String temp="";
		String src="Madam";
		
		for(int i=src.length()-1;i>=0;i--)
		{
			temp=temp+src.charAt(i);
			
		}
		
		if(src.equalsIgnoreCase(temp))
		{
			System.out.println("Given String is a palindrome");

		}else
		{
			System.out.println("Given String is not a palindrome");
		}
		
		
	}

}
