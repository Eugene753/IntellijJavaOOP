package com.GroupTask2.Task3;

public class CarTest {

    public static void main(String[] args) {

        Car[]cars={new Truck(20000,"blue",2500),new Sedan(15000,"red",25)};

        for(Car c:cars){
            System.out.println(c.calculateSalePrice());
        }
    }
}
