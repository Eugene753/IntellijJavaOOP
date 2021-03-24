package com.class14;

public class MethodExample1 {

	public static void main(String[] args) {
		
		int num=method1(12,10);
		System.out.println(num);
		method2();

	}
	public static int method1(int num1, int num2) {
		int num3;
		num3=num1+num2;
		return num3;
	}
	
	public static void method2() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
		}
	}

}
