package com.class22.SuperKeywordDemo2;

public class DogClass extends Animal{
    String breed;

    DogClass(){
        System.out.println("Child");
    }

    DogClass(String name,int age,String color,String breed){
        super(name,age,color);
        this.breed=breed;
        System.out.println("parametrized Child");
    }

    void printInfo(){
        System.out.println(name+"age"+age+"breed"+breed);
    }

}
