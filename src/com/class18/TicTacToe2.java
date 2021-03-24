package com.class18;

import java.util.Scanner;

public class TicTacToe2 {
	
	 char[][] gameBoard;

	 char num='1';
	 char num2;
	
	public  void intializedBoard() {
	
		  

		for(int i=0;i<3;i++) {
			for(int j=0;j<3 ;j++) {
				gameBoard[i][j]=num;
				num++;
				
				}
			}
		}
		
	
	public  void displayBoard(){
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
	
	
	public  char Print() {
		if(num2%2==0) {
			return 'X';
		}else {
			return 'O';
		}
	}
	
	public char enterNumber() {
		System.out.println("Enter number from 1 to 9");
		Scanner scan=new Scanner(System.in);
		int num3=scan.nextInt();
		if(num3>0 && num3<=9) {
			num2=(char)num3;
			return num2;
		}else {
			enterNumber();
		}
		return num2;
	}
	
	
	
	
	public  void number() {
		boolean bool=false;
		for(int i=0;i<gameBoard.length;i++) {
			for(int j=0;j<gameBoard[i].length;j++) {
				if(gameBoard[i][j]==num2) {
					gameBoard[i][j]=Print();
					bool=true;
					displayBoard();
				}else {
					
				}
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		TicTacToe2 tic=new TicTacToe2();
		
		tic.intializedBoard();
		tic.displayBoard();
		
		System.out.println(tic.enterNumber());
		tic.number();
		

	}




	
}

