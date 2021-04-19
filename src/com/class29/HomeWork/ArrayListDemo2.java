package com.class29.HomeWork;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Honda");
        list.add("Toyota");
        list.add("Mitsubishi");
        list.add("Mercedes-Benz");
        list.add("BMW");
        list.add("Porshe");

        System.out.println(list);


        for(String str:list){
            System.out.print(str+" ");
        }
        System.out.println();

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
