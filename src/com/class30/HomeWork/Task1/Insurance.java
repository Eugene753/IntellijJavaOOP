package com.class30.HomeWork.Task1;

public abstract class Insurance {

    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancellInsurance();

}

class Car extends Insurance{

    String carModel;

    public Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public  void getQuote(){
        System.out.println("Get quote insurance for Car");

    }
    @Override
    public  void cancellInsurance(){
        System.out.println("Cancel old Insurance for Car");
    }
}

class Pet extends Insurance{

    String petType;

    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Get quote  insurance for pet");
    }

    @Override
    public void cancellInsurance() {
        System.out.println("Cancel old insurance for pet");
    }
}

class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Get quote insurance for health");
    }

    @Override
    public void cancellInsurance() {
        System.out.println("Cancel old insurance for health");
    }
}
