package com.class34.HomeWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeWorkTask2 {

    public static List<Exception> list(){
        List<Exception> myList=new LinkedList<>();

        try{
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            myList.add(arithmeticException);
        }
        try{
            int[]arr=new int[2];
            arr[5]=12;
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            myList.add(arrayIndexOutOfBoundsException);
        }
        try{
            String str=null;
            System.out.println(str.length());
        }catch(NullPointerException nullPointerException){
            myList.add(nullPointerException);
        }
        try{
            int num=Integer.parseInt("Test");
            System.out.println(num);
        }catch (NumberFormatException numberFormatException){
            myList.add(numberFormatException);
        }

        return myList;
    }

    public static void main(String[] args) {

        Iterator<Exception>iterator=list().iterator();

        System.out.println(iterator.next()+" (This type of exception occurs when you perform an incorrect arithmetic operation)");
        System.out.println(iterator.next()+" (This type of exception occurs whne you try to access with an invalid index value)");
        System.out.println(iterator.next()+" (This exception occurs when you try to access an object with the help of a reference variable whose current value is null or empty)");
        System.out.println(iterator.next()+" (This exception occurs when you pass a string to a method that cannot be converted to a number)");


    }
}
