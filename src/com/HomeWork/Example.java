package com.HomeWork;

public class Example {

    public static void main(String[] args) {

        Child obj1=new Child("Fairfax");
        obj1.display();
    }
}
class Parent{
    String city;

    Parent(String city){
        this.city=city;
    }

    public void display() {
        System.out.println("City name "+city);
    }
}
class Child extends Parent{

    Child(String city){
        super(city);

    }
}