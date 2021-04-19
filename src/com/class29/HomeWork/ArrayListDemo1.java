package com.class29.HomeWork;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Eugene");
        list.add("Mark");
        list.add("Jack");
        list.add("Meriam");
        list.add("Thomas");

        System.out.println(list.isEmpty());
        System.out.println(list.contains("Mark"));
        System.out.println(list.size());
        System.out.println(list);



    }
}
