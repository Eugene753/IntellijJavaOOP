package com.class29.ArrayListDemo3;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");

        System.out.println(subjects);

        ArrayList<String> subjectsThatWeWantToRemove=new ArrayList<>();
        subjectsThatWeWantToRemove.add("SDLC");
        subjectsThatWeWantToRemove.add("Manual Testing");
        subjectsThatWeWantToRemove.add("Java");

        subjects.removeAll(subjectsThatWeWantToRemove);
        System.out.println(subjects);

    }
}
