package com.class33.ExceptionHandeling3;

public class Demo3 {

    public static void main(String[] args) {
        String s=null;
        if(s==null){
            System.out.println("Cen not execute methods on this object");
        }else{
            System.out.println(s.length());
        }

    }
}
