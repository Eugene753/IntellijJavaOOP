package com.class25.casting;

public class Student2Test {

    public static void main(String[] args) {


        Student2 student = new SyntaxStudent();//upcasting
        student.study();

        SyntaxStudent syntaxStudent = (SyntaxStudent) student;
        syntaxStudent.sleep();

        /*CollegeStudent collegeStudent = (CollegeStudent) student;         Wrong approach
        collegeStudent.eatInBuffet();

        SchoolStudent schoolStudent = (SchoolStudent) student;
        schoolStudent.takeLunch();

         */
    }
}
