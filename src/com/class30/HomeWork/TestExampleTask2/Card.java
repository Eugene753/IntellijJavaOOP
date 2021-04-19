package com.class30.HomeWork.TestExampleTask2;


public abstract class Card {

    String creditCardType;
    private String name;
    private String userName;
    private String email;
    private String password;
    private double balance;


    public Card(String creditCardType, String name, String userName, String email, String password,double balance) {
        this.creditCardType = creditCardType;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.balance=balance;
    }

    public void setName(String name){
        if(name.matches("^[A-Za-z]*$")){
            this.name=name;
        }else{
            System.out.println("Characters and numbers not allowed");
        }

    }
    public void setUserName(String userName){
        if(userName.matches("[^A-Za-z0-9]*$")){
            this.userName=userName;
        }else{
            System.out.println("Characters not allowed");
        }

    }
    public void setEmail(String email){
        if(email.matches("[^A-Za-z0-9]*$")&&email.contains("@")){
            this.email=email;
        }else{
            System.out.println("Cracters not allowed");
            System.out.println("Should contain @");
        }
    }
    public void setPassword(String password){
        if(password.matches("[^A-Za-z0-9%$#&]*$")&&password.length()>6){
            this.password=password;
        }else{
            System.out.println("Password to short");
            System.out.println("Should contain special character");
        }
    }

    public String getUserName(){

        return userName;
    }
    public String getPassword(){
        return password;
    }
    public double getBalance(){
        return balance;
    }


    public abstract void checkBalance(String userName,String password);

    public abstract void addMoney(String userName,String password);

    public abstract void withdrawMoney(String userName,String password);

}

