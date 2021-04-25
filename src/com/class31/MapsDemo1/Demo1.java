package com.class31.MapsDemo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<String> arraysList=new ArrayList<>();
        arraysList.add("Azizi");
        arraysList.add("Ram");
        arraysList.add("Danilo");
        arraysList.add("Mike");
        arraysList.indexOf("Mike");
        System.out.println(arraysList);
        arraysList.clear();

        System.out.println(arraysList);
        Map<Integer,String> map=new HashMap<>();
        map.put(123456,"Azizi");
        map.put(123457,"Ram");
        map.put(123458,"Danilo");
        map.put(123459,"Jon");
        map.put(123410,"Jonny");

        Map<Integer,String> map2=new HashMap<>();
        map2.put(1234,"Azizi");
        map2.put(123,"Eugene");
        map2.put(1238,"Ram");
        map2.put(1235,"Jon");
        map2.put(12341,"MJ");

        map2.putAll(map);

        System.out.println(map2);
        map2.remove(12341);
        System.out.println(map2);
        System.out.println(map2.get(123));


    }
}
