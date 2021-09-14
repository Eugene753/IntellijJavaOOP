package com.interviewTask;

import java.util.Scanner;

public class CorrectPrimeNumebrs {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();

        boolean bool = true;

        if(num>1) {
            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    bool=false;
                    break;
                }
            }
        }else {
            bool=false;
        }

        if(bool) {
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not a prime number");
        }

    }
}
