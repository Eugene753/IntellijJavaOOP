package com.class30.HomeWork.Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class CardTest {

    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Chase("Chase"));
        cards.add(new BankOfAmerica("Bank of America"));
        cards.add(new AmericanExpress("American Express"));

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).signIn();
            cards.get(i).logIn();
            cards.get(i).checkBalance();
            cards.get(i).withdraw();
        }
        System.out.println("----------------------------------");

        for (Card c : cards) {
            c.signIn();
            c.logIn();
            c.checkBalance();
            c.withdraw();
        }
        System.out.println("-----------------------------------");
        Iterator<Card> iterator= cards.iterator();

        while(iterator.hasNext()){
            Card card=iterator.next();
            card.signIn();
            card.logIn();
            card.checkBalance();
            card.withdraw();
        }
    }
}
