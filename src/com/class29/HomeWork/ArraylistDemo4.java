package com.class29.HomeWork;

import java.util.ArrayList;

public class ArraylistDemo4 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Water");
        list.add("Vodka");
        list.add("Juice");
        list.add("Tequila");
        list.add("Beer");
        list.add("Soda");
        list.add("Pepsi");

        for(int i=0;i<list.size();i++){
            if(list.get(i).contains("a")||list.get(i).contains("e")){
                list.set(i,"water");
            }
        }
        System.out.println(list);

    }
}
