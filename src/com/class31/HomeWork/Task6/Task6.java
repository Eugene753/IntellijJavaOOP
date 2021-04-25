package com.class31.HomeWork.Task6;

import java.util.ArrayList;

public class Task6 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(100);
        numbers.add(25);
        numbers.add(25);
        numbers.add(100);
        numbers.add(35);
        numbers.add(45);
        numbers.add(65);
        numbers.add(78);
        numbers.add(98);
        numbers.add(78);

        int sum=0;

        for(Integer num:numbers){
            sum+=num;
        }
        System.out.println("Sum of all numbers: "+sum);


    }
}
