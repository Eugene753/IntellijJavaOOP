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


        Map<String,String> state=new LinkedHashMap<>();

        state.put("Ukraine","Kiev");
        state.put("United States","Washington DC");
        state.put("Albania","Tirana");
        state.put("Algeria","Algiers");
        state.put("Angola","Luanda");
        state.put("Mali","Bamako");
        state.put("Malta","Valletta");
        state.put("Mexico","Mexico City");
        state.put("Morocco","Rabat");
        state.put("Nepal","Kathmandu");



        Set<String>mapCountries=countries.keySet();

        for(String key:mapCountries){

            System.out.println(key+": "+countries.get(key));

            String actualValue=state.get(key);

            System.out.println(actualValue);
        }

        System.out.println("--------------------------------------------------------");


        Set<String>mapCountries2=countries.keySet();

        Iterator<String> iterator=mapCountries2.iterator();

        while(iterator.hasNext()){
            String country=iterator.next();
            System.out.println(country+": "+countries.get(country));
        }

        System.out.println("-----------------------------------------------------------");

        Set<Map.Entry<String,String>> set=countries.entrySet();

        for(Map.Entry<String,String> country:set){
            System.out.println(country.getKey()+": "+country.getValue());
        }

        System.out.println("-----------------------------------------------------------");

        Collection<String> country=countries.values();

        for(String count:country){
            System.out.println(count);
        }






    }
}
