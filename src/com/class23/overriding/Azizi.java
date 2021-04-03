package com.class23.overriding;

public class Azizi {

    void marry(){
        System.out.println("My Boy will marry the girl that me and my wife will choose for him");
    }
}

class Son1 extends Azizi{

}

class Son2 extends Azizi{

    void marry(){
        System.out.println("I want to marry tylar swift");
    }

    public static void main(String[]args){
        Son1 son1=new Son1();
        son1.marry();
        Son2 son2=new Son2();
        son2.marry();
    }
}