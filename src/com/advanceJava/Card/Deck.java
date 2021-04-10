package com.advanceJava.Card;

import java.util.Random;

public class Deck {
    private Card[] cards=new Card[52];
    private int nextCard;
    Deck(){
    int count=0;
        for(int i=0;i<13;i++){
            for(int j=0;j<4;j++){
                cards[count]=new Card(i,j);
                count++;
            }
        }
    }

    void shuffle(){
        Random random=new Random();
        int randNumber=0;
        for(int i=0;i<52;i++){
            randNumber=random.nextInt(51);
            Card temCard1=cards[i];
            Card temCard2=cards[randNumber];
            cards[i]=temCard2;
            cards[randNumber]=temCard1;
        }
    }
    Card dealCard(){
        return cards[nextCard++];
    }

    public Card[]getCards(){
        return cards;
    }

}
