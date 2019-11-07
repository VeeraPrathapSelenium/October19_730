package com.stringmethods;

public class IsDigit_CharacterCLass {

	public static void main(String[] args) {

String data="ADFC789OPLM4123";

String temp="";

for(int i=0;i<=data.length()-1;i++)
{
	char c=data.charAt(i);
	
	
	if(Character.isDigit(c))temp=temp+c;
	
	
}

System.out.println(temp);
		
		
		
		
		
		

	}

}
