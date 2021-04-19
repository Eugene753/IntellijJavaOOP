package com.class30.SetsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();
        names.add("Afzal");
        names.add("Gul");
        names.add("Yarina");
        names.add("caner");
        names.add("Ty");
        names.add("Gul");

        System.out.println(names);

    }
}
