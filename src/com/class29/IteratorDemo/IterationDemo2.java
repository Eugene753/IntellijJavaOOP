package com.class29.IteratorDemo;

import java.util.ArrayList;

public class IterationDemo2 {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");
        System.out.println(subjects);
        for(int i=subjects.size()-1;i>=0;i--){
            if(subjects.get(i).length()>4){
                subjects.remove(subjects.get(i));
            }else{
                System.out.println(subjects.get(i).length());
            }
        }
        System.out.println(subjects);
    }
}
