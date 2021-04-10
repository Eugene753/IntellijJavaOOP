package com.class28.encapsulation;

public class Person {

    private String name;
    private String bankAccountNumber;
    private String address;
    private String SSN;

    void setName(String name){
        if(name.length()<15){
            if(name.matches("^[a-zA-Z]*$")){
                this.name=name;
            }else{
                System.out.println("only characters are allowed");
            }

        }else{
            System.out.println("Names longer than 15 characters are not allowed");
        }
    }

    String getName(){
        return name;
    }
}
