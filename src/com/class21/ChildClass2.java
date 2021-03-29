package com.class21;

public class ChildClass2 extends Parent{

    int num1;
    int num2;
    public ChildClass2(int num1, int num2, String name) {
        super(num1, num2, name);
    }

    int average(){
        return super.add()/2;
    }

    int add(){
        return super.num1+super.num2-10;
    }
}
