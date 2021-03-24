package com.class15;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String userName, password1, password2;
		System.out.println("Enter your username");
		userName=sc.next();
		System.out.println("Enter your password");
		password1=sc.next();
		System.out.println("Re-enter you password");
		password2=sc.next();
		
		if(userName.isEmpty()||password1.isEmpty()) {
			System.out.println("User name cannot be empty");
		}else if(password1.length()<8){
			System.out.println("Password is to short");
		}else if(password1.equals(userName)) {
			System.out.println("Password cannot contain username");
		}else if(!password1.equals(password2)){
			System.out.println("Password do not match");
		}else {
			System.out.println("Your username and password have been created");
		}
		
		

	}

}
