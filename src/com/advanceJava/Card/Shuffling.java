package com.advanceJava.Card;

import java.util.Scanner;

public class Shuffling {

    public static void main(String[] args) {
        Shuffling shuffling=new Shuffling();
        Deck deck=new Deck();
        shuffling.printAllcardsInOrder(deck);
        deck.shuffle();
        shuffling.printAllcardsInOrder(deck);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input a hand-size: ");

        while(true){
            int handSize=0;
            try{
                handSize=Integer.parseInt(scanner.next());
            }catch (Exception exception){
                System.out.println("Incorrect type, Please input a hand-size");
            }
            if(handSize>52){
                System.out.println("Too large of a hand, Please input a hand-size");
            }else{
                Hand hand=new Hand(handSize);
                hand.display();
            }
        }
    }

    void printAllcardsInOrder(Deck deck){
        System.out.println("The deck in order: - ");
        for(Card card:deck.getCards()){
            System.out.print(card.getRankName()[card.getRank()]+card.getSuitName()[card.getSuit()]+" ");
        }
        System.out.println();
    }
}
