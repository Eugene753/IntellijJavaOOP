package com.class22.HomeWork;

public class Test {


    static void print(){
        System.out.println("No parameters");
    }

    static void print(int a,int b){
        System.out.println("Two parameters with numbers "+(a+b));
    }
    static void print(String str, String str2){
        System.out.println("Two parameters with string type "+str+" "+str2);
    }

    public static void main(String[] args) {

        Test obj=new Test();
        obj.print();
        obj.print(10,20);
        obj.print("Hello","How are you");

    }
}
