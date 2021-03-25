package GroupTask;

import java.util.Scanner;

    public class Advertisement {
        static double width;
        static double height;
        double areaFee;
        double Tax;
        double advertisingFee;
        static String advertisementOfTheCustomer;
        int numberOfDays;
        static String ID;

    Advertisement(double width,double height,String advertisementOfTheCustomer,String ID){
        this.ID=ID;
        this.width=width;
        this.height=height;
        Tax=0.5;
        this.advertisementOfTheCustomer=advertisementOfTheCustomer;
    }
    public void calculation(){
        numberOfDays=advertisementOfTheCustomer.length();
        areaFee=width*height;
        advertisingFee= (int)(areaFee+numberOfDays*Tax);
    }
    public void feeOfAdvertisement(){
        System.out.println("Ads name is "+advertisementOfTheCustomer);

        System.out.println("Number of days = "+numberOfDays);

        System.out.println("Area Fee = "+areaFee+" OMR");

        System.out.println("Advertising Fee = "+advertisingFee+" OMR");
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Type the customer ID and the ads name : ");
        advertisementOfTheCustomer=scan.nextLine();
        System.out.print("Type the width size : ");
        width=scan.nextDouble();
        System.out.print("Type the height size : ");
        height=scan.nextDouble();
        String ID=advertisementOfTheCustomer.replaceAll("[^0-9]","");
        String AdName=advertisementOfTheCustomer.replaceAll("[0-9]","");
        AdName=AdName.trim();

        Advertisement client=new Advertisement(width,height,AdName,ID);

        client.calculation();

        client.feeOfAdvertisement();
    }
}
