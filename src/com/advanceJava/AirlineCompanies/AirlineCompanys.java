package com.advanceJava.AirlineCompanies;

import java.util.*;

public class AirlineCompanys {

    ArrayList  list=new ArrayList();
    String country;
    double fare;
    static int count;

    public void destination(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Destination country: ");
        country=scan.nextLine();
        list.add(country);
        count++;
    }
    public void ticketFare(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Input ticket fare: ");
        fare=scan.nextDouble();
        list.add(fare);
    }
    public void travetTax(){

        double fare2=fare*0.07;

        list.add(fare2);
    }

    public  double TotalPrice(){
        return fare+fare;
    }

    public void menu(){
        System.out.println("Enter your menu options: " +
                "\n Enter 1 to add booking" +
                "\n Enter 2 to display all booking" +
                "\n Enter 3 to display booking summary" +
                "\n Enter 4 to exit the program");
    }

    public void programRun(){
        int num=0;
        do {
            Scanner scanner = new Scanner(System.in);
            menu();
            num = scanner.nextInt();
            switch (num){
                case 1:
                destination();
                ticketFare();
                System.out.println("Booking saved...");
                break;
                case 2:
                    int num2=0;
                Iterator i=list.iterator();
                while(num2 < list.size())
                System.out.println("Destination country = "+i.next());
                System.out.println("Ticket fare = "+i.next());
                System.out.println("Travel Tax = "+i.next());
            }
    }while(num!=4);

    }




    public static void main(String[] args) {
        AirlineCompanys airlineCompanys=new AirlineCompanys();
        airlineCompanys.programRun();





    }


}
