package com.class18;

public class VowelsTest {

private static String vowelsString(String str1) {
		
		return str1.replaceAll("[^a,e,i,o,u]", "");
		
	}
	public static void main(String[] args) {
		
		System.out.print(vowelsString("euyrujahsdjhdasf"));

	}

	
}
