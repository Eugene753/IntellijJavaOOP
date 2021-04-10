package com.interviewTask;

import java.util.ArrayList;
import java.util.List;

public class CheckifPrimeOrNot {
    boolean isPrime=true;

    List<Integer> list=new ArrayList<>();

    public List<Integer> generate(int startingValue, int endingValue){
        for( int i=startingValue;i<=endingValue;i++){
            isPrime=checkPrime(i);
                if(isPrime){
                    list.add(i);
                }else if(i==startingValue){
                    list.add(startingValue);
                }
        }
        return list;
    }

   public static boolean checkPrime(int numberToCheck){
       int remainder;
       for(int i=2;i<=numberToCheck;i++){
           remainder=numberToCheck%i;
           if(remainder==0){
               return false;
           }
           return true;
       }
       return true;
   }
}
