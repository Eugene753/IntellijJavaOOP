package com.advanceJava.Card;

public class Card {
    private int rank;
    private int suit;
    private String[] rankName={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] suitName={"C","H","S","D"};
    public static final int CLUBS=0;
    public static final int HEARTS=1;
    public static final int SPADES=2;
    public static final int DIAMONDS=3;

    public static final int ACE=0;
    public static final int TWO=1;
    public static final int THREE=2;
    public static final int FOUR=3;
    public static final int FIFE=4;
    public static final int SIX=5;
    public static final int SEVEN=6;
    public static final int EIGHT=7;
    public static final int NINE=8;
    public static final int TEN=9;
    public static final int JACK=10;
    public static final int QUEEN=11;
    public static final int KING=12;



    Card(int rank, int suit) {
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
        return this.rankName;
    }
    public String[]getSuitName(){
        return this.suitName;
    }
}
