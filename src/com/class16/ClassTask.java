package com.class16;

public class ClassTask {

	public static void main(String[] args) {
		
		System.out.println("----------------------------- Task 1 -------------------------------------------------");
		
		String str="I am going to the store";
		System.out.println(str);
		String str2=str.replaceAll(" ", "");
		System.out.println(str2);
		System.out.println("--------------------------------------------- Task 2 --------------------------------------------");
		
		String mix="fhdjfhj787878^&&%%$^^T&*^FGHDDSH";
		String mix2=mix.replaceAll("[^a-zA-Z]", "");
		System.out.println(mix2.length());
		
		
		System.out.println("-------------------------------------------- Task 3 -----------------------------------------------");
		
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] b=a.split("[?]");
		System.out.println(b.length);
		

	}

}
