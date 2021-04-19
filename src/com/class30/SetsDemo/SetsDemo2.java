package com.class30.SetsDemo;

import java.util.*;

public class SetsDemo2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(102);
        arrayList.add(10);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(100);
        arrayList.add(100);

        Set <Integer> set=new LinkedHashSet<>(arrayList);
        /*ArrayList<Integer> removedElements=new ArrayList<>(set);
        System.out.println(removedElements);*/
        System.out.println(set);



    }
}
