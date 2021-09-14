package com.class34.HomeWork;

import java.util.Scanner;

public class HomeWorkTask3 {

    public static void ageEligibility(int age){
        if(age<16){
            throw new RuntimeException("You are to small to go to College");
        }else{
            System.out.println("Welcome to College");
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=scanner.nextInt();

        ageEligibility(age);

    }
}
