package com.Training;

public class Test {

    static int num;

    Test(){
        num++;
        System.out.println(num);
    }
    void print(){
        System.out.println(num);
    }

    public static void main(String[] args) {
            Test obj1=new Test();
            Test obj2=new Test();
            Test obj3=new Test();


            obj1.print();
    }
}
