package com.class27.Demo1;

public class PhoneTester {


    public static void main(String[] args) {
        Phone iphone=new Iphone();
        iphone.unlockPhone();

        Phone samsungPhone=new Samsung();
        samsungPhone.displayPictures();
        samsungPhone.makeCalls();


        //Phone phone=new Phone(); We are not allowed to create objects of abstract classes

    }
}
