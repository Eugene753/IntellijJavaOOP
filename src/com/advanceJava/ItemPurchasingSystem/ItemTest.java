package com.advanceJava.ItemPurchasingSystem;

import java.util.Scanner;

public class ItemTest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input Beverage SKU: ");
        String sku=scanner.nextLine();
        System.out.print("Input Beverage SRP: ");
        double srp=scanner.nextDouble();
        System.out.print("Input Beverage Inventory: ");
        int inventory=scanner.nextInt();
        System.out.print("Enter Volume/Size in ml: ");
        double volume=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Beverage Type: ");
        String type=scanner.nextLine();
        System.out.print("How many beverages you want to buy(Item Count)?: ");
        int count=scanner.nextInt();

        Beverage beverage=new Beverage(sku,srp,inventory,volume,type);

        beverage.beverageDetails();
        beverage.totalAmount(count);
    }
}
