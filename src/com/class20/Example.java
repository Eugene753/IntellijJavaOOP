package com.class20;

public class Example {

    public static String mixString(String s1, String s2) {
        /*
        StringBuilder s3=new StringBuilder();
        String s4;
        for(int i=0;i<s1.length();i++){
            s3.append(s1.charAt(i));
            s3.append(s2.charAt(i));

        }
        s4=s3.toString();
        return s4;

         */

        String s3="";
        for(int i=0;i<s1.length();i++){
            s3+=s1.charAt(i)+""+s2.charAt(i);
        }
        return s3;

    }


    public static void main(String[] args) {


        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);


    }
}


