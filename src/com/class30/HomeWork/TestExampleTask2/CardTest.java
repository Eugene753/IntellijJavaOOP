package com.class30.HomeWork.TestExampleTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class CardTest {

    public static void main(String[] args) {

        ArrayList<Card> cards=new ArrayList<>();

        cards.add(new AmericanExpress("American Express","Eugene","Eugene777","Java@gmail.com","fff777",2000));
        cards.add(new Chase("Chase","David","David777","Pro@gmail.com","ddd777",3000));
        cards.add(new BankOfAmerica("Bank of America","Igor","Igor777","Igor@gmail.com","iii777",1000));

        for(int i=0;i<cards.size();i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your username");
            String userName=scanner.nextLine();
            System.out.println("Enter your password");
            String password=scanner.nextLine();
            cards.get(i).checkBalance(userName,password);
            cards.get(i).addMoney(userName,password);
            cards.get(i).withdrawMoney(userName,password);
        }

    }
}
