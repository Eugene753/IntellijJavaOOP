package com.class27.demo2;

public class VehicleTester {


    public static void main(String[] args) {

        BMW bmw=new BMW("12345xml","Sedan","BMW","X5");

        bmw.start();
        bmw.stop();
        bmw.speed();
        bmw.drive();
        bmw.display();

        Vehicle vehicle=new Toyota("12345","SUV","Toyota","RAV4");

        if(vehicle instanceof Toyota){
            ((Toyota) vehicle).speed();
        }

        vehicle.drive();
        vehicle.start();

        Car car=new Toyota("12345","SUV","Toyota","RAV4");
    }
}
