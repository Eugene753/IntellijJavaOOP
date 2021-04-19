package com.advanceJava.AirlineCompanies2;

public class Passenger {

    private String country;
    private double fare;
    private static double tax=0.07;
    static double total;
    static int count;

    Passenger(String country,double fare){
        this.country=country;
        this.fare=fare;
        count++;
        total+=this.fare;
    }

    public String getCountry(){
        return country;
    }

    public double getFare(){
        return fare;
    }

    public double getTax(){
        return this.fare*tax;
    }
}
