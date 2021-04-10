package com.advanceJava.Card;

public class Hand {
    private Card[] cards;

    Hand(int size){
        cards=new Card[size];
        Deck deck=new Deck();
        deck.shuffle();
        deck.dealCard();
        for(int i=0;i<cards.length;i++){
            cards[i]=deck.dealCard();
        }
    }

    void display(){
        System.out.println("Your hand");
        for(Card card:cards){
            System.out.print(card.getRankName()[card.getRank()]+card.getSuitName()[card.getSuit()]+" ");
        }
        System.out.println();
    }

}
