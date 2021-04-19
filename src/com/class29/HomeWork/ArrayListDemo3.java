package com.class29.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Aerospace");
        list.add("Car");
        list.add("Lion");
        list.add("Move");
        list.add("Run");
        list.add("Activate");
        list.add("Speed");
        list.add("Absolyte");
        list.add("Airplane");

        Iterator<String> iterator=list.iterator();

       while(iterator.hasNext()){
           String word=iterator.next();
           if(word.endsWith("e")){
               iterator.remove();
           }
       }
        System.out.println(list);
    }
}
