package com.Repl;

public class repl139 {

    public static String alphabetical(String str){
        String str1="";
        for(int i=0;i<1;i++){
            str1+=str.charAt(i);
            for(int j=1;j<str.length();j++){
                if(str.charAt(j)>str.charAt(j-1)){
                    str1+=str.charAt(j);
                }
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
