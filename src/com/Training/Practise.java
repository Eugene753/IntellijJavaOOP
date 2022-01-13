package com.Training;

public class Practise {

    public static void main(String[] args) {

        String str="960.00";
        String str1="Member earns 960 point";

        String newString=str1.replaceAll("[^0-9]","");

        double d=Double.parseDouble(newString);

        double d2=Double.parseDouble(str);

        if(d2==d){
            System.out.println("true");
        }else{
            System.out.println("false");
        }





    }
}
