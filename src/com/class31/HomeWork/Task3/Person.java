package com.class31.HomeWork.Task3;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    Person(String name,String lastName,int age,double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public static void display(Map <String,Person> employees) {
        Set<String> employee = employees.keySet();
        for (String key : employee) {
            System.out.println(key + ": " + employees.get(key));
        }
    }

    @Override
    public String toString() {
        return  "Name = " + name +
                " LastName = " + lastName +
                " Age = " + age +
                " Salary = " + salary;
    }
}
