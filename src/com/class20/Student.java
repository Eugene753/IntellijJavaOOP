package com.class20;

public class Student {

    String name;
    String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void printInfo(){
        System.out.println(name+address);
    }
}
