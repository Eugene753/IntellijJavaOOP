package com.advanceJava.AirlineCompanies2;

import java.util.Scanner;

public class AirlinesCompaniesTest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DisplayInforamtion displayInforamtion=new DisplayInforamtion();
        int num=0;
        do{
            DisplayInforamtion.menu();
            num=scanner.nextInt();
            scanner.nextLine();
            switch(num){
                case 1:
                    System.out.print("Input destination Country: ");
                    String country=scanner.nextLine();
                    System.out.print("Input ticket fair: ");
                    double fare=scanner.nextDouble();
                    Passenger passenger=new Passenger(country,fare);
                    displayInforamtion.addBooking(passenger);
                    System.out.println("Booking saved...");
                    break;
                case 2:
                    displayInforamtion.displayBooking();
                    break;
                case 3:
                    displayInforamtion.bookingSummary();
                    break;
                case 4:
                    System.out.println("Good buy");
                    break;
                default:
                    System.out.println("Invalid input please try again");
                    break;
            }
        }while(num!=4);
    }
}
