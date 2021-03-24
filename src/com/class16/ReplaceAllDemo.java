package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		
		
		String var1="Syntax is best34343. Batch nine is great";
		System.out.println(var1.replaceAll("[0-9]", ""));
		var1="908847587sdfsdfgdfgdfghDFGGDFDF";
		System.out.println(var1.replaceAll("[a-zA-Z]", ""));
		var1="89988787879009adadadfgADFGGF^%&$&%^$&%^";
		System.out.println(var1.replaceAll("[A-Za-z0-9]", ""));
		

	}

}
