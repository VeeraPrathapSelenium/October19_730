package com.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChecvkedExeptions {

	public static void main(String[] args) throws FileNotFoundException,NullPointerException {
		
		ReadFile();
		

	}
	
	
	public static void ReadFile() throws FileNotFoundException
	{
		File f=new File("abc.txt");
		FileInputStream fis=new FileInputStream(f);
	}

}
