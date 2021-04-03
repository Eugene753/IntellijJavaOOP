package com.class24.demo;


import com.class17.StrudentTest;

public class PersonTester {

    public static void main(String[] args) {

        Person person=new Student();
        Person person1=new Teacher();
        Person person2=new Employee();

        //Student student=new Person();
        //Student student=(Student) person1;
        Student student=(Student) person;


    }
}
