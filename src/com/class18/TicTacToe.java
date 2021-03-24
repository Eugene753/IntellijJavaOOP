package com.class18;

import java.util.Scanner;
public class TicTacToe {
    String arr[][] ={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    String num;
    Scanner scan = new Scanner(System.in);
    int count =1;
    void startGame(){
        print();
        while (count<=9){
            scan();
            changeArr();
            if(checkWinner()){
                break;
            }
        }
        if(!checkWinner()){
            System.out.println("It's a tie");
        }
    }
    void print(){
        for(String[] a:arr){
            for(String el:a){
                System.out.print("        "+el);
            }
            System.out.println();
        }
    }
    String checkTurn(){
        if(count%2==0){
            return "X";
        }else{
            return"0";
        }
    }
    
    String scan(){
        System.out.println("Please type number from 1-9 to place "+checkTurn());
        int number = scan.nextInt();
        if(number>0&&number<=9){
            num = String.valueOf(number);
        }else{
            scan();
        }
        return num;
    }
    void changeArr(){
        boolean a = false;
        for(int i =0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j].equals(num)){
                    arr[i][j]=checkTurn();
                    count++;
                    print();
                     a = true;
                }
            }
    }
        if(!a){
            scan();
            changeArr();
        }
    }
    boolean checkWinner(){
        for(int i =0;i<arr.length;i++){
            if(arr[i][0].equals(arr[i][1])&&arr[i][1].equals(arr[i][2])){
                System.out.println(arr[i][0]+" IS A WINNER!");
                return true;
            }else if(arr[0][i].equals(arr[1][i])&&arr[0][i].equals(arr[2][i])){
                System.out.println(arr[0][i]+" IS A WINNER!");
                return true;
            }
        }
        if((arr[0][0].equals(arr[1][1])&&arr[0][0].equals(arr[2][2]))||arr[0][2].equals(arr[1][1])&&arr[0][2].equals(arr[2][0])){
            System.out.println(arr[1][1]+" IS A WINNER!");
            return true;
        }
        return false;
    }
}

