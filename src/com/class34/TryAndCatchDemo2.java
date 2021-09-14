package com.class34;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class TryAndCatchDemo2 {

    public static void main(String[] args) throws FileNotFoundException {

        int[] arr={10,20};
        try{
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound");
        }

        String name=null;
        if(name!=null){
            name.length();
        }else{
            System.out.println("Null Object");
        }

        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\userDa.xlsx";


        File  file=new File(path);


        if(file.exists()){
            FileInputStream fileInputStream=new FileInputStream(path);
            //System.out.println("File not found");
            throw new FileNotFoundException("File not found");
            //FileInputStream fileInputStream=new FileInputStream(path);
        }else{

            System.out.println("File not found");
        }

        int num1 = 0;
        int num2 = 10;




        if(num1<num2){

            throw new ArithmeticException("You cant devide on zero");

        }else {
            System.out.println("Zero is bigger");
        }

    }
}
