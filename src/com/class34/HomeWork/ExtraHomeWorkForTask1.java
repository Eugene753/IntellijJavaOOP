package com.class34.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExtraHomeWorkForTask1 {
    int num1;
    int num2;
    int division;
    public  void num1(){
        while(true) {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter 1st number");
                num1 = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
            }
        }
    }
    public void num2(){
        while(true) {
            try {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter 2nd number");
                num2 = scanner.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
            }
        }
    }
    public void division(){
        while(true){
            try{
                division=num1/num2;
                break;

            }catch (ArithmeticException e) {
                if (num2 == 0) {
                    System.out.println("Can't divide by zero");
                    num2();
                }
            }
        }
        System.out.println("Your result is "+division);
    }
    public static void main(String[] args) {
        ExtraHomeWorkForTask1 task1=new ExtraHomeWorkForTask1();

        task1.num1();
        task1.num2();
        task1.division();

    }
}
