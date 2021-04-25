package com.class31.HomeWork;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();

        countries.put("Ukraine","Kiev");
        countries.put("United States","Washington DC");
        countries.put("Albania","Tirana");
        countries.put("Algeria","Algiers");
        countries.put("Angola","Luanda");
        countries.put("Mali","Bamako");
        countries.put("Malta","Valletta");
        countries.put("Mexico","Mexico City");
        countries.put("Morocco","Rabat");
        countries.put("Nepal","Kathmandu");

        Set<String>mapCountries=countries.keySet();
        for(String key:mapCountries){
            System.out.println(key+": "+countries.get(key));
        }

        System.out.println("--------------------------------------------------------");

        Iterator<String> iterator=mapCountries.iterator();

        while(iterator.hasNext()){
            String country=iterator.next();
            System.out.println(country+": "+countries.get(country));
        }

        System.out.println("-----------------------------------------------------------");

        Set<Map.Entry<String,String>> set=countries.entrySet();

        for(Map.Entry<String,String> country:set){
            System.out.println(country.getKey()+": "+country.getValue());
        }

    }
}
