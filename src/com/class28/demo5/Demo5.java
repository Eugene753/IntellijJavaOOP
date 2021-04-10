package com.class28.demo5;

public class Demo5 implements I1,I2 {
    public void method1(){
        I1.method1();
        I2.method1();
    }

}
interface I1{
    static void method1(){
        System.out.println("Interface 1");
    }
}
interface I2{
    static void method1(){
        System.out.println("Interface 2");
    }
}
