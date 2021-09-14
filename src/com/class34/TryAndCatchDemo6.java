package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryAndCatchDemo6 {

    public static void main(String[] args) {

        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\userData.xlsx";
        FileInputStream fileInputStream=null;
        //System.out.println(10/0);
        try {
            fileInputStream=new FileInputStream(path);
            System.out.println("Next line of code");
            return;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }finally{
            try {
                //System.out.println(10/0);
                System.out.println("Will always be executed");
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println(10/0);


    }
}
