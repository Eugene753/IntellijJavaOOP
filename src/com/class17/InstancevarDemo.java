package com.class17;

public class InstancevarDemo {
	
	String name;
	int age;
	void printInfo(double salary) {
		//if I am inside the same class and my method is not static 
		//I can use my instance variables directly
		 salary=120000;
		
		System.out.println(name+" "+age);
	}
}
