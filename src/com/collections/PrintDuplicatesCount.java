package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicatesCount {

	public static void main(String[] args) {
		String data="ABCGGAAABCCCCCBBVDGGGTTHHH";	
		
		
		Map<Character,Integer> chars=new HashMap<Character,Integer>();
		
		char[] arr=data.toCharArray();
		
		for (char c : arr) {
			
			if(! chars.containsKey(c))
			{
				chars.put(c, 1);
			}else{
				chars.put(c, chars.get(c)+1);
			}
			
			
			
			
			
		}
		
		System.out.println(chars);
		
		
		

	}

}
