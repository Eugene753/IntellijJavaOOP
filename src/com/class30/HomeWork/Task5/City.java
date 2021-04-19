package com.class30.HomeWork.Task5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class City {

    public static void main(String[] args) {

        Set<String> city=new LinkedHashSet<>();

        city.add("New York City");
        city.add("Abu Dhabi");
        city.add("Ankara");
        city.add("Alexandria");
        city.add("Boston");
        city.add("Lucern");
        city.add("Bern");
        city.add("Kiev");
        city.add("Moscow");

        Iterator<String> iterator=city.iterator();

        while(iterator.hasNext()){
            String c=iterator.next();
            if(c.startsWith("A")){
                iterator.remove();
            }
        }
        for(String c:city){
            System.out.println(c);
        }



    }
}
