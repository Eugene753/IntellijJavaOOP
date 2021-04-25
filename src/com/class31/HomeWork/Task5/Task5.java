package com.class31.HomeWork.Task5;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Task5 {

    public static void main(String[] args) {

        Set<String> list=new LinkedHashSet<>();
        list.add("If");
        list.add(" you");
        list.add(" work");
        list.add(" hard");
        list.add(" you");
        list.add(" will");
        list.add(" get");
        list.add(" a");
        list.add(" job");

        String str2="";

        for(String str:list){
            str2+=str;
        }
        System.out.println("String concatenate: "+str2);



    }
}
