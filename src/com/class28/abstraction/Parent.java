package com.class28.abstraction;

public abstract class Parent {

    abstract void method1();
}
class Child extends Parent{

    @Override
    void method1() {
        System.out.println("Abstractk method");
    }
}