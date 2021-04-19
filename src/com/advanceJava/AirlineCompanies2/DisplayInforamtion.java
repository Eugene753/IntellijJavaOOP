package com.advanceJava.AirlineCompanies2;

import java.util.ArrayList;

public class DisplayInforamtion {

    private ArrayList<Passenger> list=new ArrayList<>();

    public void addBooking(Passenger pass){
        list.add(pass);
    }

    public void displayBooking(){
        for(Passenger p:list){
            System.out.println("Destination country = "+p.getCountry());
            System.out.println("Ticket Fare = "+p.getFare());
            System.out.println("Travel Tax (7% of fare ) = "+p.getTax());
        }
    }

    public void bookingSummary(){
        System.out.println("Total Booking Count = "+Passenger.count);
        System.out.println("Total price for all booking = "+Passenger.total);
    }

    public static void menu(){
        System.out.println("Enter your menu options: " +
                "\n Enter 1 to add booking" +
                "\n Enter 2 to display all booking" +
                "\n Enter 3 to display booking summary" +
                "\n Enter 4 to exit the program");
    }
}
