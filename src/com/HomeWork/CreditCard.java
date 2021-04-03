package com.HomeWork;

public class CreditCard {

    int balance;
    double interest;

    CreditCard(int balance){
        this.balance=balance;
    }
    public void calculateInterest(){
        interest=balance*0.05;
        System.out.println("Your interest: "+interest);
    }
}

class Visa extends CreditCard{
        Visa(int balance){
        super(balance);
    }
}

class AX extends CreditCard{

    AX(int balance){
        super(balance);
    }

    public void calculateInterest(){
        interest=balance*0.1;
        System.out.println("Your interest: "+interest);
    }
}