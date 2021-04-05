package com.class25.casting;

public class Animal {

    void eat(){
        System.out.println(" Animal can eat");
    }
    void sleep(){
        System.out.println("Animal can sleep");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dogs like to eat meat");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{

    void speak(){
        System.out.println("meow meow");
    }
}
