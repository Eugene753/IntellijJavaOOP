package com.class29.ArrayListDemo7;

import java.util.ArrayList;

public class ArrayListDemo7 {

    public static void main(String[] args) {



        ArrayList arrayList=new ArrayList();
        arrayList.add("azizi");
        arrayList.add("ram");
        arrayList.add("mirage");

        for(Object ob:arrayList){
            System.out.println(((String)ob).length());
        }

    }
}
