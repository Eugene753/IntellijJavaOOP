package com.class25.casting;

public class AnimalTester {

    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        animal.sleep();
        //animal.speak(); no place to old
        Cat cat=(Cat) animal;
        cat.speak();






    }
}
