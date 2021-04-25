package com.Repl.Traning;

import java.util.*;

public class Repl {



    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("null");
        list.add("Sohil");
        list.add("Diego");
        list.add("Alijon");
        list.add("Asel");
        list.add("Sumair");

        for(String str:list){
            System.out.println(str);
        }

        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }




    }
}
