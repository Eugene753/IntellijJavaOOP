package com.class15;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------- Task 1 ---------------------------------------------");
		
		Scanner scan=new Scanner(System.in);
		String momFirstName, dadFirstName, gender,kidsName;
		System.out.println("Enter moms first name");
		momFirstName=scan.next();
		System.out.println("Enter dads first name");
		dadFirstName=scan.next();
		System.out.println("Enter gender of a baby");
		gender=scan.next();
		
		
		if(gender.equalsIgnoreCase("boy")) {
			
			kidsName=dadFirstName.substring(0,3)+momFirstName.substring(2);
			System.out.println(kidsName.toUpperCase());
	
		}else if(gender.equalsIgnoreCase("girl")) {
			
			kidsName=momFirstName.substring(0,2)+dadFirstName.substring(3);
			System.out.println(kidsName.toUpperCase());
		}
		


	}
	
	

}
