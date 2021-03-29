package GroupTask;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the customer name: ");
        String customerName= scan.nextLine();
        System.out.print("Enter the mobile number: ");
        int mobile=scan.nextInt();
        System.out.print("Enter the number of days: ");
        int day=scan.nextInt();
        System.out.print("Enter the cost per day: ");
        int cost=scan.nextInt();
        System.out.print("Enter the number of people: ");
        int numOfPeople=scan.nextInt();

        Book hotelCalculate=new Book(customerName,mobile,day,cost);

        System.out.println("Customer Name = "+customerName);
        System.out.println("Mobile number = "+mobile);
        System.out.println("Service charge = "+hotelCalculate.serviceCharge());

        hotelCalculate.totalCost();
        hotelCalculate.totalCost(numOfPeople);
    }
}
