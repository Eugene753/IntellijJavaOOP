package com.advanceJava.Card;

public class Card {
    private int rank;
    private int suit;
    private String[] rankName =new String[]{
            "A","2","3","4","5","6","7","8","9","10","J","Q","K",
    };
    private String[] suitName=new String[]{
      "C","H","S","D"
    };
    public static final int rankCard=0;
    public static final int suitCard=0;
    Card(int rank,int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }
    public String[]getRankName(){
        return rankName;
    }
    public String[]getSuitName(){
        return suitName;
    }
}
