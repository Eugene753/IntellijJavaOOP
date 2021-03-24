package com.class15;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------- Task 3 ---------------------------------------------");

		Scanner scan=new Scanner(System.in);
		String str1,str2="";
		System.out.println("Enter string");
		str1=scan.next();
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			str2+=str1.charAt(i);
			
		}
		System.out.println(str2);
		
		
	}

}
