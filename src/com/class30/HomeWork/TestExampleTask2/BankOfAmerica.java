package com.class30.HomeWork.TestExampleTask2;

import java.util.Scanner;

public class BankOfAmerica extends Card {

    double num;

    public BankOfAmerica(String creditCardType, String name, String userName, String email, String password,double balance) {
        super(creditCardType, name, userName, email, password,balance);
    }

    @Override
    public void checkBalance(String userName1,String password1) {

        if(userName1.equals(getUserName())&&password1.equals(getPassword())){
            System.out.println("Your balance is "+getBalance());
        }else{
            System.out.println("Invalid input");
        }
    }

    @Override
    public void addMoney(String userName1,String password1) {

        Scanner scanner=new Scanner(System.in);
        if(userName1.equals(getUserName())&&password1.equals(getPassword())){
            System.out.println("Enter amount you would like to add");
            double amount=scanner.nextDouble();
            num=getBalance();
            num+=amount;
            System.out.println("Your balance is "+num);
        }else{
            System.out.println("Invalid input");
        }
    }

    @Override
    public void withdrawMoney(String userName1,String password1) {

        if(userName1.equals(getUserName())&&password1.equals(getPassword())){
            Scanner scanner=new Scanner(System.in);
            while(true) {
                System.out.println("Enter amount you would like to withdraw");
                double withdraw = scanner.nextDouble();
                if(withdraw<num){
                    num-=withdraw;
                    System.out.println("Your remain balance "+num);
                    break;
                }else{
                    System.out.println("insufficient funds");
                }
            }
        }
    }
}
