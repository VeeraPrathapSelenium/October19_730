package com.stringmethods;

public class Equals {

	public static void main(String[] args) {
		String data1="india";
		
		String data2="INDIA";
		
		System.out.println(data1.equals(data2));
		
		System.out.println(data1.equalsIgnoreCase(data2));
		System.out.println(data1.contentEquals(data2));
		
	

	}

}
