package com.class29.ArraListDemo;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        System.out.println(subjects.size());
        subjects.add("Manual Testing");
        System.out.println(subjects.size());
        subjects.add("Java");
        System.out.println(subjects.size());
        subjects.add("Git");
        System.out.println(subjects.size());
        subjects.add("Selenium");
        System.out.println(subjects.get(2));
        subjects.add("TestNG");
        System.out.println(subjects.size());
        //System.out.println(subjects.get(6)); RE
        System.out.println(subjects.indexOf("Java"));
        System.out.println("Size before removal "+subjects.size());
        subjects.remove("Git");
        System.out.println("Size after removal "+subjects.size());

    }
}
