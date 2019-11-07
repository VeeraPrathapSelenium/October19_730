package com.stringmethods;

public class LastIndexOF {

	public static void main(String[] args) {
		
		String path="C:\\Users\\tm\\Downloads\\POM_GIt_Maven_Jenkins_FrameWork-master";
		
		int pos=path.lastIndexOf("\\")+1;
		
		System.out.println(path.substring(pos));
		
		
		
	}

}
