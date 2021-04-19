package com.class30.HomeWork.Task2;

public abstract class Card {
    private String creditCardType;

    public Card(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardType(){
        return creditCardType;
    }

    public abstract void signIn();

    public abstract void withdraw();

    public void checkBalance(){
       System.out.println("Balanced checked");
   }
   public void logIn(){
       System.out.println("You are logged in");
   }
}
class Chase extends Card{

    public Chase(String creditCardType) {
        super(creditCardType);
    }

    @Override
    public void signIn() {
        System.out.println("You singed in");
        System.out.println("Welcome to "+getCreditCardType());
    }

    @Override
    public void withdraw() {
        System.out.println("You withdraw from "+getCreditCardType());
    }
}
class BankOfAmerica extends Card{

    public BankOfAmerica(String creditCardType) {
        super(creditCardType);
    }

    @Override
    public void signIn() {
        System.out.println("You singed in");
        System.out.println("Welcome to "+getCreditCardType());
    }

    @Override
    public void withdraw() {
        System.out.println("You withdraw from "+getCreditCardType());
    }
}
class AmericanExpress extends Card{

    public AmericanExpress(String creditCardType) {
        super(creditCardType);
    }

    @Override
    public void signIn() {
        System.out.println("You singed in");
        System.out.println("Welcome to "+getCreditCardType());
    }

    @Override
    public void withdraw() {
        System.out.println("You withdraw from "+getCreditCardType());
    }
}
