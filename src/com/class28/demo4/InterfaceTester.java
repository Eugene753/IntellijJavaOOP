package com.class28.demo4;

public class InterfaceTester {

    public static void main(String[] args) {
        InterfaceI1 interfaceI1=new Child();
        InterfaceI2 interfaceI2=new Child();
        interfaceI1.method();
        interfaceI2.method();
    }
}
