package com.loopingstatements;

public class Pattern_2 {

	public static void main(String[] args) {
		
		String temp="";
		
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					
					temp=temp+j;
					
					
				}
				System.out.println(temp);
				temp="";
				
				
			}

	}

}
