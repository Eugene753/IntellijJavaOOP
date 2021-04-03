package com.advanceJava;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator obj=new Calculator(0.0);
        Calculator obj2=new Calculator(0.0);
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        double x=scan.nextDouble();
        System.out.print("Enter a value for y: ");
        double y=scan.nextDouble();
        System.out.println("Before any operations, value = "+obj.getValue());

        obj.add(12.0);
        System.out.println("value = "+ obj.getValue());
        obj.multiply(x*x*x);
        obj.add(5);
        System.out.println("value = "+obj.getValue());
        obj2.add(3);
        System.out.println("value = "+ obj2.getValue());
        obj2.multiply(y*y);
        System.out.println("value = "+ obj2.getValue());
        obj.subtract(obj2.getValue());
        System.out.println("value = "+obj.getValue());
        obj2.clear();
        obj2.add(4);
        obj2.multiply(y);
        obj2.add(x);
        System.out.println("value = "+obj2.getValue());
        obj.divide(obj2.getValue());
        System.out.println("value = "+obj.getValue());
    }
}
