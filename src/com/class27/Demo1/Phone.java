package com.class27.Demo1;

abstract class Phone{
    void makeCalls(){
        System.out.println("Calling");
    }
    void sendText(){
        System.out.println("Sending text");
    }
    abstract void displayPictures();
    abstract void unlockPhone();
}
class Iphone extends Phone{
    void displayPictures(){
        System.out.println("Iphone uses Photos app to display pictures");
    }

    @Override
    void unlockPhone(){
        System.out.println("Iphone users can unlock phone by using face ID");
    }
}
class Samsung extends Phone{
    /*@Override
    void makeCalls(){
        System.out.println("Calling from Samsung");
    }*/
    @Override
    void unlockPhone(){
        System.out.println("Can unlock both with face ID and FingerPrint");
    }
    @Override
    void displayPictures(){
        System.out.println("Use the Gallery App to display the picture");
    }

}