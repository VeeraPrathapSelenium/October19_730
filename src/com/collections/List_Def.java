package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_Def {

	public static void main(String[] args) {


		List<String> emp_names=new ArrayList<>();
		
		//to add an item 
		emp_names.add("Prathap");
		emp_names.add("Raj");
		emp_names.add("Krish");
		emp_names.add("Prathap");
		emp_names.add("Prathap");
		emp_names.add(null);
		
		
		List<String> companies=new ArrayList<>();
		companies.add("TCS");
		companies.add("CTS");
		
	/**	
		//print a value from the list
		
		System.out.println(emp_names.get(0));
		
		//iterate over a list
		Iterator itr=emp_names.listIterator();
		//to check if there is next item exist
		while(itr.hasNext())
		{
			//print the current items and move the cursor to the next item
			System.out.println(itr.next());
		}
	*/
		/*
		for (Object object : emp_names) {
			System.out.println(object);
		}
		*/
		
	//get the size of a list
		
		System.out.println(emp_names.size());
		System.out.println(emp_names.get(emp_names.size()-1));
	//remove an items
		
		emp_names.remove(emp_names.size()-1);
		
		System.out.println(emp_names.size());
		
		//insert a value by overiding the existing value
		emp_names.set(0, "Testing master");
		
		
		//add list into a list
		
		emp_names.addAll(companies);
		
		System.out.println(emp_names.size());
		//to check if an item is exist
		System.out.println(emp_names.contains("Rahul"));
		
		//Sort the list
		
		Collections.sort(emp_names);
		for (Object object : emp_names) {
			System.out.println(object);
		}

	}

}
