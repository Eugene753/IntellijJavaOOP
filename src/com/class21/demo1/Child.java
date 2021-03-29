package com.class21.demo1;

public class Child extends Parent{

    //String name;
    Child(String name){
        super(name);
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
