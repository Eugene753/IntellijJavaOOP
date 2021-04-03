package com.class24.demo;

public class Person {

    String name;
    int age;
    void sleep(){
        System.out.println("Person asleeps");
    }
    void eat(){
        System.out.println("Person eats");
    }
}

class Employee extends Person{

}

class Teacher extends Person{

}

class Student extends Person{

}