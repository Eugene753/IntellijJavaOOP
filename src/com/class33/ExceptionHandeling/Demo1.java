package com.class33.ExceptionHandeling;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {

    public static void main(String[] args)  {
        String path="C:\\Users\\imark\\IdeaProjects\\JavaOop\\Files\\userData.xlsx";
        /*try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found try again");
            System.out.println("Sent email to support to fix the file");
        }*/

        try{
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException e){
            System.out.println("File is not found ");
            System.out.println("An email has been sent to the support channel");
        }
        System.out.println("Important code");
        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");
        System.out.println("other code");

    }
}
