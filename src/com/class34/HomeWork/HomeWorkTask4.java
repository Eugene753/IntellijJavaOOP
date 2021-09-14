package com.class34.HomeWork;

import java.util.Scanner;

public class HomeWorkTask4 {

    public static void checkUserName(String name){
        if(name.length()<5){
            throw new RuntimeException("Name should be more then 5 characters");
        }else{
            System.out.println("Valid input");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your user name");
        String name=scanner.nextLine();

        checkUserName(name);
    }
}
