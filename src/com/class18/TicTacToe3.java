package com.class18;

import java.util.Scanner;

public class TicTacToe3 {

	static char[][] gameBoard;
	static char num='1';
	static char player1='X';
	static char player2='O';
	static int row;
	static int colomn;
	
	public static void startGame() {
		System.out.print("================ Welcome to the game TicTacToe ============================");
		
		int count = 0;
		initialized();
		displayBoard();
		
		while(count<9) {
		
		enterNumberPlayer1();
		
		if(checkWinner()) {
			System.out.println("Congratulation Player "+gameBoard[row-1][colomn-1]+" Winner");
			break;
		}	
	
		enterNumberPlayer2();
	
		if(checkWinner()) {
			System.out.println("Congratualtion Player "+gameBoard[row-1][colomn-1]+" Winner");
			break;
		}
		count++;
		}
		if(!checkWinner()) {
			System.out.println("Tie");
		}	
	}
	
	public static void initialized() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				gameBoard[i][j]=num;
				num++;
			}
		}
	}		
	
	public static void displayBoard(){
		System.out.println("=============");
		for(int i=0;i<3;i++) {
			System.out.print("| ");
			for(int j=0;j<3;j++) {
				System.out.print(gameBoard[i][j]+" | ");
			}
			System.out.println();
			System.out.println("=============");
		}
	}	
	
	public static void enterNumberPlayer1() {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Player 1 'X' enter row from 1 to 3 and colomn from 1 to 3");
		row=scan.nextInt();
		colomn=scan.nextInt();
		if(row>3||colomn>3) {
			System.out.println("Wrong input");
			enterNumberPlayer1();
		}else {
			if(gameBoard[row-1][colomn-1]=='X' || gameBoard[row-1][colomn-1]=='O') {
			enterNumberPlayer1();
			}else 	{
				gameBoard[row-1][colomn-1]=player1;
				displayBoard();
			}
		}
	}
	
	public static void enterNumberPlayer2() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Player 2 'O' enter row from 1 to 3 and colomn from 1 to 3");
		row=scan.nextInt();
		colomn=scan.nextInt();
		if(row>3||colomn>3) {
			System.out.println("Wrong input1");
			enterNumberPlayer2();
		}else {
		
			if(gameBoard[row-1][colomn-1]=='X' || gameBoard[row-1][colomn-1]=='O') {
				enterNumberPlayer2();
			}else {
			gameBoard[row-1][colomn-1]=player2;
			displayBoard();
			}

		}
	}
	
	public static boolean checkWinner() {
		
		for(int i=0;i<gameBoard.length;i++) {
			if(gameBoard[i][0]==gameBoard[i][1]&&gameBoard[i][0]==gameBoard[i][2]) {
				return true;
			}else if(gameBoard[0][i]==gameBoard[1][i]&&gameBoard[0][i]==gameBoard[2][i]) {
				return true;
			} 
		}
		if(gameBoard[0][0]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][2]||gameBoard[0][2]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][0]) {
				return true;
			}
		
		return false;
				
	}
	
	public static void main(String[] args) {
		gameBoard=new char[3][3];
		startGame();
		
	}

}
