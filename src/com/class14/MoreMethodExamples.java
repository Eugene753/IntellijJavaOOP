package com.class14;

public class MoreMethodExamples {
	
	/*
	 * 
	 * Create a method that does not take any values
	 * and always return String Hi
	 */
	
	String print() {
		return "Hi";
	}
	
	/*
	 * 
	 * create a method that takes a number
	 * and returns the double of that number
	 * 
	 */
	double doubleTheValue(double input) {
		return input*2;
	}
	
	/*
	 * Create a method that takes a boolean as input
	 * if value is true I want to say take the umbrella
	 * and if the value is false print please go for a walk
	 */
	
	
	void isRainning (boolean isRain) {
		
		if(isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
		
	}
	
	void great() {
		for(int i=0;i<5;i++) {
			System.out.println("Batch 9 is great");
		}
	}
	
	/*
	 * Create a method that takes 2 numbers as input and 
	 * return the greater number
	 * 
	 * 
	 * 
	 */
	
	int larger(int x,int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	
	/*
	 * create a method that takes a number if number is
	 * even print number is even otherwise print number is odd
	 * 
	 */
	
	void EvenOdd(int num1) {
		if(num1%2==0) {
			System.out.println("Number "+num1+" is Even");
		}else {
			System.out.println("Number "+num1+" is Odd");
		}
	}
	
	/*
	 * write a method that takes an array and returns the
	 * sum of the elements that are present in the array
	 * 
	 * 
	 */
	
	double returnTheArraySum(double[]arr) {
		double sum=0;
		for(double element:arr) {
			sum=sum+element;
		}
		return sum;
	}
	
	boolean mirrow(String str) {
		
		String newStr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		
		if(str.equals(newStr)) 
		{
		return true;
		}else 
		{
		return false;
		}
	}
	
	
	
	
}
