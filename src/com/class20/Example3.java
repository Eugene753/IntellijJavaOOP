package com.class20;

public class Example3 {
    static String surround(String s,String search_term){
    String str;

    str=s.replaceAll(search_term,"("+search_term+")");
        return str;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }

    
}
