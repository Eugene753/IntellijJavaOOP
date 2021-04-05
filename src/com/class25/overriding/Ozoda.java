package com.class25.overriding;

public class Ozoda extends KFather{
    public Ozoda(String name){
        super(name);
    }

    void sleep(){
        System.out.println(name+" likes tp sleep "+16);
    }

    void eat(){
        super.eat();
        System.out.println(name+" likes to eat burger");
    }

}
