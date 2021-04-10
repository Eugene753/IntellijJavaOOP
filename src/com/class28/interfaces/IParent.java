package com.class28.interfaces;

public interface IParent {

    //private int number = 10; all variables in interfaces are public
    public static final int number=10; //no need to make variables as public static final because they are already public static final
    int number2=20;

    /*IParent(){

    }*/ //Interface can not have constructor because they dont have instance fields

    void method1();

}


interface IParent2{
    void method2();
}

class AdvanceChild implements IParent,IParent2{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}