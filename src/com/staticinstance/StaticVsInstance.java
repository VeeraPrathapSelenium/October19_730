package com.staticinstance;

public class StaticVsInstance {
	int a,b,c;
	
	static String usernae,password;
	
	
	
	

	public static void main(String[] args) {
		
System.out.println(usernae);
mul();

StaticVsInstance obj=new StaticVsInstance();



System.out.println(obj.a);	

obj.add();

	}
	
	
	public void add()
	{
		System.out.println(usernae);
		mul();
	}
	
	public static void mul()
	{
		System.out.println(usernae);
	}
	
	
	
	
	
	
	
	

}
