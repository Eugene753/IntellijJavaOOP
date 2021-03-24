package com.class17;

public class Ram {

	public static void main(String[] args) {
		
		
		int salary=1000100;
		StringBuilder sb=new StringBuilder(String.valueOf(salary));
		sb.reverse();
		System.out.println();
		salary=Integer.parseInt(sb.toString());
		System.out.println(salary);
		
		
		double salary1=0.0000001;
		StringBuilder sb1=new StringBuilder(String.valueOf(salary1));//converting a double to String and a string to String Builder
		System.out.println(sb1.toString());
		
		sb.reverse();//reversing it
		System.out.println(sb1.toString());
		
		salary=Integer.parseInt(sb1.toString());//converting back to double
		System.out.println(salary1);
		
		
		
			
		}

	}


