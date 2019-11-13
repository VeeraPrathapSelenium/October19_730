package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsImp {

	public static void main(String[] args) {
		
		Map<Integer,String> emp_details=new HashMap<Integer,String>();
		
		emp_details.put(1, "Prathap");
		emp_details.put(null, "Rahul");
		emp_details.put(null, "Raj");
		emp_details.put(3, null);
		
		
		
		
		//System.out.println(emp_details.get(3));
		
		for (Entry<Integer, String> data : emp_details.entrySet()) {
			
			System.out.println(data.getValue());
			
		}
		
		
		//verify if a key is exist or not
		
		System.out.println(emp_details.containsKey(2));
		
		
		
		
		

	}

}
