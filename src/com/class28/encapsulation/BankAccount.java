package com.class28.encapsulation;

public class BankAccount {

    private String name;
    private String userName;
    private String password;
    private double balance;

    public BankAccount(String name, String userName, String password, double balance) {
        setName(name);
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    double getBalance(String userName,String password){
        if(name.matches("^[A-za-z]*$")){
            return balance;
        }else{
            System.out.println("Characters not allowed");
            return -1;
        }
    }

    public void setName(String name){
        if(name.matches("^[A-za-z]*$")){
            this.name=name;
        }else{
            System.out.println("Characters not allowed");
        }
    }

    public void login(String userName,String password){
        if(this.userName.equals(userName)&&this.password.equals(password)){
            System.out.println("Welcome to the bank");
        }else{
            System.out.println(":Something went wrong");
        }

    }
}
