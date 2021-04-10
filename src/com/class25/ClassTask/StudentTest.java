package com.class25.ClassTask;

public class StudentTest {

    public static void main(String[] args) {

        Student students1=new SyntaxStudent();
        Student students2=new CollegeStudent();
        Student students3=new SchoolStudent();




        /*SyntaxStudent s1= (SyntaxStudent) students1;
        CollegeStudent s2=(CollegeStudent) students2;
        SchoolStudent s3=(SchoolStudent) students3;*/


        Student[] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for(Student student:students){
            student.sleep();
            student.eat();
            student.study();
            if(student instanceof SyntaxStudent){
                ((SyntaxStudent)student).work();
            }else if(student instanceof CollegeStudent){
                ((CollegeStudent)student).party();
            }else if(student instanceof SchoolStudent){
                ((SchoolStudent)student).playVideoGames();
            }
        }







    }

}