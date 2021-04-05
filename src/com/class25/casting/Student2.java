package com.class25.casting;

public class Student2 {

    void study() {
        System.out.println("Student is studying");
    }
    void go() {
        System.out.println("Student is going");
    }
}
class SyntaxStudent extends Student2 {
    @Override
    void study() {
        System.out.println("Syntax Student is studying");
    }
    void sleep() {
        System.out.println("Syntax Student is sleeping during the class");
    }

}

class CollegeStudent extends Student2 {
    @Override
    void study() {
        System.out.println("College Student is studying");
    }
    @Override
    void go() {
        System.out.println("College Student is going college");
    }
    void eatInBuffet() {
        System.out.println("College Student is eating in buffet");
    }
}

class SchoolStudent extends Student2 {
    @Override
    void study() {
        System.out.println("School Student is studying");
    }
    @Override
    void go() {
        System.out.println("School Student is going to school");
    }
    void takeLunch() {
        System.out.println("School student taking lunch");
    }
}