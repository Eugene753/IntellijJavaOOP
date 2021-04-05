package com.class25.staticOverRiding;

public class staticOverRiding {

   static void printInfo(){
       System.out.println("Bla bla");
   }
}

class Child extends staticOverRiding{

    static void printInfo(){
        System.out.println("Bla bla from child class");
    }
}
