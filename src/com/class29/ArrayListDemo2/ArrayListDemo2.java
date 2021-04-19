package com.class29.ArrayListDemo2;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");
        System.out.println(subjects);

        for(String subject:subjects){
            System.out.println(subject);
        }
        subjects.remove("Selenium");
        System.out.println(subjects);
        subjects.add(4,"Selenium");
        System.out.println(subjects);
    }
}
