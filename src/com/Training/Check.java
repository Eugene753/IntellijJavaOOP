package com.Training;

import java.util.ArrayList;
import java.util.Collections;

public class Check {

    public String check(String string){
        ArrayList<Character> str1=new ArrayList<>();
        for(int i=0;i<string.length();i++){
            str1.add(string.charAt(i));
        }

        ArrayList<Character> str2=new ArrayList<>();

        for(int i=0;i<str1.size();i++){
           if(str1.get(i)=='f'||str1.get(i)=='F'){
               str2.add('k');
               str2.add(str1.get(i));
           }else{
               str2.add(str1.get(i));
           }
        }

        String str3="";

        for(int i=0;i<str2.size();i++){
            str3+=str2.get(i);
        }

        return str3;
    }



    public static void main(String[] args) {
        Check c=new Check();

        System.out.println(c.check("Fluffy"));
    }
}
