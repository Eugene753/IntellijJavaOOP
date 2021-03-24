package com.class15;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Example1 obj=new Example1();
		
		Scanner sc=new Scanner(System.in);
		String name, lastName, email;
		System.out.println("Enter you first name, last name, and email type Example: gmail, yahoo, yandex");
		
		name=sc.next();
		lastName=sc.next();
		email=sc.next();
		
		obj.createEmail(name, lastName, email);

	}

}
