package com.class30.HomeWork.Task4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Countries {

    public static void main(String[] args) {

        Set<String> countries=new TreeSet<>();

        countries.add("Ukraine");
        countries.add("United States");
        countries.add("Italy");
        countries.add("Germany");
        countries.add("Czech Republic");
        countries.add("Romania");
        countries.add("Russia");

        for(String str:countries){
            System.out.println(str+" ");
        }

        System.out.println("------------------------------------------------------");

        Iterator<String> iterator=countries.iterator();

        while(iterator.hasNext()){

            String country=iterator.next();
            System.out.println(country);
        }
    }
}
