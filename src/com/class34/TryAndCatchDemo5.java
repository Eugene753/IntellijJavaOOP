package com.class34;

public class TryAndCatchDemo5 {

    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            try{
                String name=null;
                System.out.println(name.indexOf(10));
            }catch (Exception e){

            }
        }catch(ArithmeticException arithmeticException){
            System.out.println("Can not divide by zero");
        }

        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Can not divide by zero");
        }

        try{
            String name=null;
            System.out.println(name.indexOf(10));
        }catch(NullPointerException nullPointerException){
            System.out.println("Null object");
        }

    }
}
