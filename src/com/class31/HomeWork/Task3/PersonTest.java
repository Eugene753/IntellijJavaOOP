package com.class31.HomeWork.Task3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {

    public static void main(String[] args) {

        Map<String,Person> employees=new TreeMap<>();
        employees.put("ID78787",new Person("Igor","Mark",34,35000));
        employees.put("ID454887",new Person("Mark","Zuckerberg",40,55000));
        employees.put("ID5646521",new Person("Gina","Henkel",20,45000));
        employees.put("ID8978151",new Person("Mary","Helen",27,80000));
        employees.put("ID874512",new Person("Helena","Taktarova",30,90000));
        employees.put("ID7842121",new Person("Ben","Williams",28,450000));
        employees.put("ID58754121",new Person("Tina","Popey",42,78000));
        employees.put("ID56541214",new Person("Jimmy","San",29,65000));
        employees.put("ID25784151",new Person("Frank","Timberland",30,63000));
        employees.put("ID56745121",new Person("Ron","Penber",36,71000));

        //Person.display(employees);

        Collection<Person> personCollection= employees.values();

        for(Person person:personCollection){
            person.printDetails();
        }

    }
}
