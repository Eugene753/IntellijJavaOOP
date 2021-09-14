package com.class34;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator=new Calculator();

        try{
            calculator.Calculate();
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
        }
        catch (NullPointerException nullPointerException){
            System.out.println("Null object");
        }



    }
}
