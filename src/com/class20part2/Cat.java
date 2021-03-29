package com.class20part2;

public class Cat extends Animal {

    Cat(String name){
        this.name=name;
    }

    void run(){
        System.out.println(name+" is running");
    }
    void walk(){
        System.out.println(name+" is walking");
    }
    void bark(){
        System.out.println(name+" is barking");
    }
    void meow(){
        System.out.println(name+" is meowing");
    }
}
