package com.interviewTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckifPrimeOrNot {
    boolean isPrime=true;

    List<Integer> list=new ArrayList<>();

    public List<Integer> generate(int startingValue, int endingValue){
        for( int i=startingValue;i<=endingValue;i++){
            isPrime=checkPrime(i);
                if(isPrime){
                    list.add(i);
                }
        }
        return list;
    }

   public static boolean checkPrime(int numberToCheck){
       boolean bool = true;

       if(numberToCheck>1) {
           for(int i=2;i<numberToCheck;i++) {
               if(numberToCheck%i==0) {
                   return bool=false;
               }
           }
       }else {
           return bool=false;
       }
       return true;

   }

    public static void main(String[] args) {
        CheckifPrimeOrNot checkifPrimeOrNot=new CheckifPrimeOrNot();



        System.out.println(checkifPrimeOrNot.generate(2,150));

    }
}
