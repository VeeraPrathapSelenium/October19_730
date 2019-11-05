package com.stringmethods;

public class Split {

	public static void main(String[] args) {
		String data="India,America Japan";
		
		String[] arr=data.split(" ");
		
		for (String word : arr) {
			System.out.println(word);
		}

	}

}
