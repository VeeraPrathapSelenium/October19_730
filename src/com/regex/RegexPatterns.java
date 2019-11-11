package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatterns {

	public static void main(String[] args) {

String pattern="[a-z0-9]*\\.[a-z0-9]*\\@[a-z]*\\.[a-z]*";

String data="My email id is abc.xyz1@tcs.com";

ReusableComponenets rc=new ReusableComponenets();
		
		rc.getPatternData(pattern, data);
		

	}

}
