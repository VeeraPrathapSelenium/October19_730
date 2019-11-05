package com.stringmethods;

public class CharAt {

	public static void main(String[] args) {
		String data="India is a great country";
		data=data.toLowerCase().replace(" ", "");
		
		String temp="";
		
		int vowelsCount=0;
		
		int consonantsCount=0;
		
		int strlen=data.length();
		for(int i=0;i<=strlen-1;i++)
		{
		
			char charac=data.charAt(i);
			
			if(charac=='a'||charac=='e'||charac=='i'|| charac=='o'||charac=='u')
			{
				temp=temp+charac;
				vowelsCount++;
			}
			else
			{
				consonantsCount++;
			}
			
			
			
			
			
		}
	
System.out.println("The total vowels are "+temp+" and the number of character are "+vowelsCount);

System.out.println("Total consonants are "+consonantsCount);
}}
