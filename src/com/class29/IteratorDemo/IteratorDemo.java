package com.class29.IteratorDemo;

import java.util.ArrayList;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");

        for(String subject:subjects){
            if(subject.length()>4){
                subjects.remove(subject);//RE
            }
        }
        System.out.println(subjects);

    }
}
