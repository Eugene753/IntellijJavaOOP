package com.class19;

import java.util.Scanner;

public class NewsletterAdvertising {

    String adName;
    String customerID;
    double adWidth;
    double adHeight;
    int numOfDays;
    double areaFee;
    double adFee;

    public NewsletterAdvertising(String adName, String customerID, double adWidth, double adHeight){
        this.adName=adName;
        this.customerID=customerID;
        this.adWidth=adWidth;
        this.adHeight=adHeight;
        numOfDays=adName.length();
    }
    public void calculate(){
        areaFee=(adHeight*adWidth);
        adFee=(areaFee+numOfDays*0.5);
        adFee=Math.floor(adFee);
    }
    public void print(){
        System.out.println("Ads name is "+adName);
        System.out.println("Number of days = "+ numOfDays);
        System.out.println("Area Fee = "+ areaFee+" OMR");
        System.out.println(("Advertising fee = "+adFee+" OMR"));
    }

}


