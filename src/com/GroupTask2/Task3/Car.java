package com.GroupTask2.Task3;

public abstract class Car {

    int carPrice;
    String color;

    Car(int carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}

    class Truck extends Car {
        int weight;

        Truck(int carPrice, String color, int weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        double calculateSalePrice() {
            System.out.print("Price of Truck with discount: ");
            if (weight > 2000) {
                 return carPrice-carPrice*0.1;
            } else {
                return carPrice-carPrice*0.2;
            }
        }
    }

    class Sedan extends Car {
        int length;

        Sedan(int carPrice, String color, int length) {
            super(carPrice, color);
            this.length = length;
        }

        @Override
        double calculateSalePrice() {
            System.out.print("Price of Sedan with discount: ");
            if (length > 20) {
                return carPrice - carPrice *0.05;
            } else {
                return carPrice - carPrice * 0.1;
            }
        }
    }


