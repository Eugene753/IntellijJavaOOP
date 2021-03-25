package com.class19;

import java.util.Scanner;

public class NewsListingAdvertisingMain {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Type the customer ID and the ads name : ");
        String id_name=input.nextLine();
        System.out.print("Type the with size : ");
        double with=input.nextDouble();
        System.out.print("Type the height size : ");
        double height=input.nextDouble();
        String id = id_name.replaceAll("[^0,1,2,3,4,5,6,7,8,9]", "");
        String name = id_name.replaceAll("[0,1,2,3,4,5,6,7,8,9]", "");
        name=name.trim();
        NewsletterAdvertising obj1=new NewsletterAdvertising(name,id,with,height);
        obj1.calculate();
        obj1.print();
    }
}
