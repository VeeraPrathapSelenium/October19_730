package com.loopingstatements;

public class PrintPattern {

	public static void main(String[] args) {

		String ptrn="*";
		
		String temp="";
		
		for(int i=1;i<=5;i++)
		{
			
		
			
			
			for(int j=1;j<=i;j++)
			{
				temp=temp+ptrn;
				
			}
			System.out.println(temp);
			temp="";
			
			
			
		}
		
		
		

	}

}
