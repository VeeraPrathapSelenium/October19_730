package com.GlobalLocal;

public class GlobalLocal {
	
	int a=10;
	int b=34;
	float c;
	

	public static void main(String[] args) {
		
		GlobalLocal gb=new GlobalLocal();
		
		gb.doTest();		
		System.out.println(gb.c);

	}
	
	
	
	public void doTest()
	{
		//local variables
		int a=40;
		int b=45;
		
		int c=a+b;
		
		System.out.println("Inside method "+c);
		
	}
	
	
	

}
