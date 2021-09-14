package com.Repl.Traning;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Repl {

    public static void gradeCheck(int grade) throws SyntaxStudentException {
        if(grade>90){
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }else{
            System.out.println("You are a great student");
        }
    }



    public static void main(String[] args) {
        int num=100;
        try {
            gradeCheck(num);
        }catch(SyntaxStudentException syntaxStudentException){
            System.out.println(syntaxStudentException);
        }


    }
}

class SyntaxStudentException extends Exception{
    SyntaxStudentException(String msg) {
        super(msg);
    }
}