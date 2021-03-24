package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		
		MoreMethodExamples obj1=new MoreMethodExamples();
		
		System.out.println(obj1.print());
		System.out.println(obj1.doubleTheValue(10));
		//System.out.println(obj1.isRainning(true));error as we are not returning anything
		obj1.isRainning(true);
		
		obj1.great();
		
		System.out.println("Entere number "+obj1.larger(10, 20)+" is larger");
		
		obj1.EvenOdd(5);
		
		double[] arr= {10.2,25,30};
		System.out.println(obj1.returnTheArraySum(arr));
		
		System.out.println(obj1.mirrow("aba"));
		
		

	}

}
