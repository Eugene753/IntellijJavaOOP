package com.class22.methodoverloading;

public class MethodOverloadingDemo2 {

 /*   void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }*/
    void add(double a,int b){
        System.out.println(a+b);
    }
    /*return add(double a,int b){
        return a+b;CE errors same parameters only return type is different
    }*/
    void add(int a,double b){
        System.out.println(a+b);
    }
    /*void add(double a,int b,int c){
        System.out.println(a+b+c);
    }*/
    /*void add(int[]arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }*/
    void add(int...arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 ob1=new MethodOverloadingDemo2();
        /*ob1.add(10,10);
        ob1.add(10.5,10.0);
        ob1.add(10.0,10);
        ob1.add(5,10.5);
        ob1.add(10.0,10,25);
        int[] arr={10,12,13};
        ob1.add(arr);*/

        //int[] arr={10,20,13};
        ob1.add(10);
        //ob1.add(10,10);
        ob1.add(10,10,25);
        ob1.add(10,25,36,45);


    }
}
