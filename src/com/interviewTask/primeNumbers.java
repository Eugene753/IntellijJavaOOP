package com.interviewTask;

import java.util.ArrayList;
import java.util.List;

public class primeNumbers {

    public static void main(String[] args) {
        CheckifPrimeOrNot obj1=new CheckifPrimeOrNot();

        List<Integer> newList=new ArrayList<>();
        newList=obj1.generate(2,25);

        for (Integer a:newList) {
            System.out.print(a+" ");
        }
    }
}
