package com.Training;

public class superKeyWord {

    public static void main(String[] args) {

        B obj=new B();
        obj.print();
        obj.print2();

        System.out.println(obj.sum());



    }
}
class A{
    String str="Hello";
    int num=10;

}
class B extends A{
    String str="Hi";
    int num=10;

    void print(){
        System.out.println(str);
    }
    void print2(){
        System.out.println(this.str);
    }

    int sum(){
        return num+super.num;
    }
}