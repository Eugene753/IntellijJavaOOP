package com.advanceJava.Card;

public class Example {


    public static void main(String[] args) {
        Card2 obj=new Card2();

    String[] rank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    String[] suit={"C","H","S","D"};
    int k=0;
    /*for(int i=0;i<=3;i++){
        for(int j=0;j<=12;j++){
            obj[k]=rank[j]+suit[i];
            System.out.print(card[k]+" ");
            k++;
        }
        System.out.println();
    }*/



    }
}
class Card2{
    Card[] card;

    Card2(){
        this.card=new Card[52];
    }
}