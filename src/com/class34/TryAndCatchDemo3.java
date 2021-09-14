package com.class34;

public class TryAndCatchDemo3 {

    public static void main(String[] args) {

        try{
            System.out.println(10/0);
            String name=null;
            System.out.println(name.length());
            int arr[]={10,60};
            System.out.println(arr[5]);
            System.out.println(arr[-1]);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
