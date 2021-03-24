package com.class16;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		
		String var1="Hello";
		var1=var1.replace('e','a');//we can replace the characters
		System.out.println(var1);
		
		
		String var2="Syntax is best. Batch 9 is best";//we can also replace the words/Strings
		System.out.println(var2.replace("best", "amazing"));

	}

}
