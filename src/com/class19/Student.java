package com.class19;

public class Student {

	String name;
	int grade1;
	int grade2;
	int grade3;
	int gradesEverage;
	
	Student(String nameOfStudent,int score1,int score2,int score3){
		name=nameOfStudent;
		grade1=score1;
		grade2=score2;
		grade3=score3;
	}
	
	void gradesEverage() {
		gradesEverage=(grade1+grade2+grade3)/3;
		
		System.out.println(name+" your avarage grade is: "+gradesEverage);
	}
}
