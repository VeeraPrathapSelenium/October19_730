package com.collections;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllDuplicates {

	public static void main(String[] args) {


		String data="ABCGGAAABCCCCCBBVDGGGTTHHH";	
		
		Set chars=new HashSet();
		
		char[] arr=data.toCharArray();
		
		for (char c : arr) {
			
			chars.add(c);		
			
			
		}
		
		System.out.println(chars);
		
		
		
		
		
		
		

	}

}
