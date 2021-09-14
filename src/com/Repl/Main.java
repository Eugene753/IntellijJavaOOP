package com.Repl;

import java.util.List;
import java.util.Map;

public class Main implements Functions{

    public static void main(String[] args) {
        Main main=new Main();
        double firstNumber=100.00;
        double secondNumber=20.00;
        double[]d={main.adding(firstNumber,secondNumber),main.subtracting(firstNumber,secondNumber),main.multiply(firstNumber,secondNumber),main.dividing(firstNumber,secondNumber)};
        main.display(d);
    }
    public void display(double[] result){
        for(double r:result){

            System.out.println("Result is ::: "+r);

        }
    }

    public double adding(double firstNumber,double secondNumber){

        return firstNumber+secondNumber;
    }


    public double subtracting(double firstNumber,double secondNumber){

        return firstNumber-secondNumber;
    }
    public double multiply(double firstNumber,double secondNumber){

        return firstNumber*secondNumber;
    }
    public double dividing(double firstNumber,double secondNumber){

        return firstNumber/secondNumber;
    }


}
