package com.class30.IteratorDemo2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");


        Iterator<String> iterator=subjects.iterator();


        while (iterator.hasNext()){
           String var=iterator.next();
            if(var.length()>4){
                iterator.remove();
            }
        }


    }
}
