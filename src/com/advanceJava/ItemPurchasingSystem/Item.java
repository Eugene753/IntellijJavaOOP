package com.advanceJava.ItemPurchasingSystem;

public class Item {

    private String SKU;
    private double SRP;
    private int inventory;

    Item(){

    }

    public Item(String SKU, double SRP, int inventory) {
        this.SKU = SKU;
        this.SRP = SRP;
        this.inventory = inventory;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public double getSRP() {
        return SRP;
    }

    public void setSRP(double SRP) {
        this.SRP = SRP;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public void totalAmount(int itemCount){
        double totalAmount;
        if(inventory>5){
            totalAmount=SRP*itemCount;
            System.out.println("Total amount "+totalAmount);
        }else{
            System.out.println("Sorry,item is out of stock");
        }
    }
}
