package com.Training;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        List<String> list2=new ArrayList<>();

        list.add("Hello");
        list.add("Aloha");
        list.add("Armagedon");
        list.add("Bye");


        for(int i=0;i<list.size();i++){
            if(list.get(i).startsWith("A")){
                list2.add(list.get(i).toLowerCase());
            }
        }
        for(String str:list2){
            System.out.println(str);
        }
    }
}
