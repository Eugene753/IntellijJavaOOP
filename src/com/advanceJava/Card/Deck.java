package com.advanceJava.Card;

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

    void print(){
        for(int i=0;i<13;i++){
            for(int j=0;j<4;j++){

            }
        }
    }






}
