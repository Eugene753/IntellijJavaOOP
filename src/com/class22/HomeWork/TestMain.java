package com.class22.HomeWork;

public class TestMain {

    private void print(){
        System.out.println("No parameters");
    }

    private void print(int a,int b){
        System.out.println("Two parameters with numbers "+(a+b));
    }
    private void print(String str, String str2){
        System.out.println("Two parameters with string type "+str+" "+str2);
    }

    public static void main(String[] args) {
        /*TestMain obj=new TestMain();

        obj.print();
        obj.print(25,55);
        obj.print("I am fine","Thank you");*/

    }
}
