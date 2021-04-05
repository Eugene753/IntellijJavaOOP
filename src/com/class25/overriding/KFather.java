package com.class25.overriding;

public class KFather {

    String name;
    KFather(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+" like to eat Rice");
    }
    void sleep(){
        System.out.println(name+" like to sleep 6 hours");
    }
}
