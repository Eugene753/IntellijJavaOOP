package com.class25.overriding;

public class Khadija extends KFather {

    public Khadija(String name){
        super(name);
    }

    void eat(){
        super.eat();
        System.out.println(name+" likes beans as well");
    }

    void sleep(){
        System.out.println(name+" likes to sleep 12 hours");
    }
}
