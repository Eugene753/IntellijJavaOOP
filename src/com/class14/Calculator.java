package com.class14;

public class Calculator {

	int add(int num1,int num2) {
		return num1+num2;
	}
	
	double sub(double num1,double num2) {
		return num1-num2;
	}
	
	double multiply(double num1,double num2) {
		return num1*num2;
	}
	
	double division(double num1, double num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			return 0;
		}
	}

}
