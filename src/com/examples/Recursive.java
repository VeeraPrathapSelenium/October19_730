package com.examples;

public class Recursive {

	static int i=0;
	
	public static void main(String[] args) {
		
		doRecursive(50);

	}
	
	public static void doRecursive(int uservalue)
	{
		if(i<=uservalue)
		{
			System.out.println(i);
			i++;
			doRecursive(uservalue);
		}
		
		
		
		
	}
	
	
	
	
	
	

}
