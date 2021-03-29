package com.class22.SuperKeywordDemo3;

public class SuperAndStatic {
    String color;

    static void printInf() {
        //color="kdfjsgkjfsdkgj";why CE error
        //super.color="jdhfsgjhdsfjghjdfhg";why CE error
    }


    public static void main(String[] args) {
        SuperAndStatic superAndStatic=new SuperAndStatic();
        superAndStatic.color="Red";
        SuperAndStatic superAndStatic2=new SuperAndStatic();
        superAndStatic2.color="White";
        SuperAndStatic superAndStatic3=new SuperAndStatic();
        superAndStatic3.color="Black";




    }
}