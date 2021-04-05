package com.class26;

public class Task1 {

    final int number;
    int var1=20;
    Task1(int number){
        this.number=number;
    }

    /*void init(int number){
        this.number=number;//CE variable is final can not change it
    }*/
    public static void main(String[] args) {
        final Task1 var1=new Task1(10);
        //var1=new Task1(20);
        var1.var1=45555;
        final int[] a={10,20};
        //a={20,445};
        a[1]=30;
    }
}
