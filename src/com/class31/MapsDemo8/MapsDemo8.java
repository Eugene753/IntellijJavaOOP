package com.class31.MapsDemo8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsDemo8 {

    public static void main(String[] args) {

        HashMap<String,Double> groceries=new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("potato",10.0);
        System.out.println(groceries);

        Iterator<String>iterator=groceries.keySet().iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            if(key.contains("o")){
                iterator.remove();
            }
            //groceries.keySet().removeIf(key -> key.contains("o")); Shorter way
            System.out.println(groceries);

        }
    }
}
