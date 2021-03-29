package GroupTask;

import java.util.Scanner;

public class MobileTest {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Input the mobile details: ");
        String detail=scan.nextLine();
        System.out.print("Input the no of items: ");
        int numOfItems=scan.nextInt();
        System.out.print("Input the price: ");
        double price=scan.nextDouble();

        Mobile mobile=new Mobile(detail,numOfItems,price);

        System.out.println("Replace Mobile Details = "+ mobile.replaceMobileDetailes());
        System.out.println("Company Code = "+ mobile.CompanyCode());
        System.out.println("Discount = "+mobile.dicount()+" OMR");
        System.out.println("Amount to Pay = "+mobile.amountToPay()+" OMR");


    }
}
