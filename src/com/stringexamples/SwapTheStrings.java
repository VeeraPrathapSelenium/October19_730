package com.stringexamples;

public class SwapTheStrings {

	public static void main(String[] args) {

		String a="America";
		
		String b="Japan";
		
		//condition donot use substring,third variable
		
		
		a=a+"@"+b;
		
		b=a.split("@")[0];
		a=a.split("@")[1];
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		

	}

}
