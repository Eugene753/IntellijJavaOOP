package com.class23;

public class Calculator {

    private static void add(int number){

    }

/*    public static void add(int number2){
  CE error
    }*/

    public static void main(String[]args){
        System.out.println("1");
        main("Hello",5);
    }
    public static void main(String args){
        System.out.println("2");
    }
    public static void main(int args){
        System.out.println("3");
    }
    public static void main(String args,int a){
        System.out.println("4");
    }
}
