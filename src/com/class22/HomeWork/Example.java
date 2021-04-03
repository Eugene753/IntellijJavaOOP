package com.class22.HomeWork;

public class Example {

    public static String alphabetical(String str){
        String str1="";
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)>str.charAt(i-1)){
                str1+=str.charAt(i);
            }

        }
        return str1;



    }



    public static void main(String[] args) {

        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));//stwr
        System.out.println(alphabetical("language"));//lnug


    }

}

