package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo1 {

    public static void main(String[] args) {

        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\userData.xlsx";

        System.out.println("Something important");
        System.out.println("Something important");
        System.out.println("Something important");
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file that you are trying to read from this path "+path+" is not present there");
            System.out.println("sends an email to the admin");
            //File file=new File(path);
        }

        try{
            System.out.println("Inside try code");

        }catch(NullPointerException exception){
            System.out.println("catch block");
            System.out.println("catch block");
            System.out.println("catch block");
        }catch (Exception nullPointerException){
            System.out.println("Cathch block");
        }

        System.out.println("Catch block");
        System.out.println("Catch block");
        System.out.println("Catch block");


    }
}
