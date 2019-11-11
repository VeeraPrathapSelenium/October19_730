package com.regex;

public class StringWithRegEx {

	public static void main(String[] args) {
		String data="AB65BCO852DEF741-++/****";
		
		
		data=data.replaceAll("[^0-9]", "@");
		
		String[] arr=data.split("@");
		
		int temp=0;
		
		for (String string : arr) {
			
			if(! string.isEmpty())
			{
				temp=temp+Integer.valueOf(string);
			}
			
			
		}
System.out.println(temp);
	}

}
