package com.HomeWork;

public class CreditCardMain {

    public static void main(String[] args) {

        CreditCard obj1=new CreditCard(1000);
        obj1.calculateInterest();

        Visa obj2=new Visa(3000);
        obj2.calculateInterest();

        AX obj3=new AX(2000);
        obj3.calculateInterest();



    }
}
