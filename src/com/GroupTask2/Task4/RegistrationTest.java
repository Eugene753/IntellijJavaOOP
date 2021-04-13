package com.GroupTask2.Task4;

public class RegistrationTest {

    public static void main(String[] args) {


        Registration registration=new Registration();

        registration.setEmail("Jeka@yahoo.com");
        registration.setUserName("Barista");
        registration.setPassword("IlikeToDance777");

        System.out.println(registration.getEmail());
        System.out.println(registration.getUserName());
        System.out.println(registration.getPassword());


    }
}
