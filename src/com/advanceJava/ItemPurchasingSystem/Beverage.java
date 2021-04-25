package com.advanceJava.ItemPurchasingSystem;

public class Beverage extends Item{

    public double volume;
    public String type;

    public Beverage(String SKU, double SRP, int inventory, double volume, String type) {
        super(SKU, SRP, inventory);
        this.volume = volume;
        this.type = type;
    }

    public void beverageDetails(){
        System.out.println("Beverage Item Details");
        System.out.println("Beverage SKU = "+getSKU());
        System.out.println("Beverage SRP = "+getSRP()+" OMR");
        System.out.println("Beverage Type = "+type);
        System.out.println("Beverage Volume/Size "+volume+" ml");
    }

    public double storageCost(){
        return getSRP()*0.1;
    }

    @Override
    public void totalAmount(int itemCount){
        double totalAmount;
        if(getInventory()>5&&getInventory()>itemCount){
            totalAmount=getSRP()*itemCount+storageCost();
            System.out.println("Total Amount of Beverage Items = "+totalAmount+" OMR");
        }else{
            System.out.println("Sorry, beverage item is currently unavailable");
        }
    }
}
