package com.class15;

public class Example1 {
	void createEmail(String name,String lastName,String emailType) {
		if(emailType.contains("@")) {
			System.out.println("Incorrect input of email");
		}else {
			
		
		System.out.println(name.toLowerCase()+""+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com");
		}
	}
}
