package DeckOfCards;


import java.util.Scanner;

public class CardGame {

    int rank=0;
    int suit=0;

    String[] rankName={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    String[] suitName={"C","H","S","D"};
    String[] Deck=new String[52];
    int hand=0;


    void initilizeDeck(){
        int card=0;
        for(int i=suit;i<4;i++){
            for(int j=rank;j<13;j++){
                Deck[card]=rankName[j]+suitName[i];
                System.out.print(Deck[card]+" ");
                card++;
            }
            System.out.println();
        }
    }

    void Hand(){
        handsize();
        String[] cards=new String[hand];
        int count=0;
        for(int i=0;i<hand;i++){
            cards[count]=Deck[i];
            System.out.print(cards[count]+" ");
            count++;
        }
    }

     void handsize(){
        Scanner scan=new Scanner(System.in);
         System.out.println("Enter hand size");
         hand=scan.nextInt();
        if(hand>6){
            handsize();
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        CardGame c=new CardGame();
        c.initilizeDeck();
        c.Hand();
    }



}
