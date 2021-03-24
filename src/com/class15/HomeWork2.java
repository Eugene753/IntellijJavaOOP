package com.class15;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------- Task 2 -----------------------------------------------");
		Scanner scan=new Scanner(System.in);
	
		String str;
		System.out.println("Enter a string");
		str=scan.next();
		if(!str.isEmpty()) {
			if(str.length()%2!=0 && str.length()>=3) {
				System.out.println(str.charAt(str.length()/2));
			}else {
				System.out.println("Even number of charachters ");
			}
		}else {
			System.out.println("String is empty");
		}

	}
}


