package com.GroupTask2.Task2;

public class MarksTest {

    public static void main(String[] args) {

        Marks[]marks={new A(45,58,70),new B(60,45,89,63)};

        for(Marks m:marks){
            System.out.println(m.getPercentage());
        }

    }
}
