package com.loopingstatements;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++)
		{
			
			int result= checkForPrime(i);
			
			if(result==2)
			{
				System.out.println(i);
			}
		}
		
		
		
		
	
	}

	
	
	public static int checkForPrime(int number)
	{
		int counter=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{			
				counter++;
			}
			
		}
		
		return counter;
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
