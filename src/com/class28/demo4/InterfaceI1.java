package com.class28.demo4;

public interface InterfaceI1 {
    void method();
}
interface InterfaceI2{
    void method();
}
class Child implements InterfaceI1,InterfaceI2{

    @Override
    public void method() {
        System.out.println("same method for all the");
    }
}
