package com.class17;

public class StrudentTest {

	public static void main(String[] args) {
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		
		s1.studentName="Igor";
		s1.studentID=123;
		Students.numberOfStudents++;
		
		s2.studentName="Ivan";
		s2.studentID=456;
		Students.numberOfStudents++;
		
		s3.studentName="Potap";
		s3.studentID=789;
		Students.numberOfStudents++;
		
		System.out.println("Total students: "+Students.numberOfStudents);

	}

}
