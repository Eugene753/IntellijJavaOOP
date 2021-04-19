package com.class29.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<Integer> num=new ArrayList<>();

        for( int i = 1; i<=50; i++){
            if(i%2==0){
                num.add(i);
            }
        }
        System.out.println(num);

        Iterator<Integer> iterator=num.iterator();

        while(iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }
        System.out.println(num);

    }
}
