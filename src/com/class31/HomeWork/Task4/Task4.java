package com.class31.HomeWork.Task4;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        double max=0;
        String str1="";

        Map<String,Double> employees=new HashMap<>();

        employees.put("Igor",1000000.0);
        employees.put("Maria",650000.0);
        employees.put("Slava",650000.0);
        employees.put("Marta",680000.0);
        employees.put("Vasyl",950000.0);
        employees.put("Peter",500000.0);
        employees.put("Arnold",650000.0);
        employees.put("Anton",940000.0);
        employees.put("Frank",1500000.0);
        employees.put("Azel",780000.0);

        System.out.println("--------------With Iterator--------------------------");

        Set<String> emp= employees.keySet();

        Iterator<String> iterator=emp.iterator();

        while(iterator.hasNext()){
            String str=iterator.next();
            Double salary1=employees.get(str);
            if(salary1 > max ){
                max=salary1;
                str1=str;
            }
        }
        System.out.println(str1+" "+max);

        System.out.println("---------------Without Iterator--------------------");

        double max1=0;
        String str2="";

        Set<Map.Entry<String,Double>> employee=employees.entrySet();

        for(Map.Entry<String,Double> entry:employee){
            if(entry.getValue()>max1){
                max1= entry.getValue();
                str2=entry.getKey();
            }
        }
        System.out.println(str2+" "+max1);




    }
}
