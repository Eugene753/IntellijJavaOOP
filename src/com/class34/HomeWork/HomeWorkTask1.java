package com.class34.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWorkTask1 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int num = scanner.nextInt();
        }catch (InputMismatchException inputMismatchException){
            System.out.println("You can enter only numbers");
        }

    }
}
