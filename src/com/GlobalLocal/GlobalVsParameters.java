package com.GlobalLocal;

public class GlobalVsParameters {
	
	int a=40;
	
	static int b=50;
	

	public static void main(String[] args) {
		GlobalVsParameters gb=new GlobalVsParameters();
			gb.add(10,30);
			
			
	}
	
	
	
	
	public  void add(int a,int b)
	{
		System.out.println((this.a+this.b)+(a+b));
	}

}
