package com.class34;

public class Account {

    double balance;
    Account(double balance){
        this.balance=balance;
    }
    public void transfer(double amountToTransfer)throws InsufficeitnFundsException,NullPointerException{
        if(balance<amountToTransfer){
            //System.out.println("Insufficient funds");
            throw new InsufficeitnFundsException("Not enough balance");
           // System.out.println("fdgdfghdfgh");
        }

    }
}
