package GroupTask;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Type Driver ID : ");
        String ID=scan.next();
        System.out.print("Type Petrol Allowance : ");
        int petrol=scan.nextInt();
        System.out.print("Type Days Worked : ");
        int days=scan.nextInt();
        System.out.print("Type Daily Rate : ");
        double rate= scan.nextDouble();
        System.out.print("Type Monthly Allowance : ");
        double mAllowance=scan.nextDouble();

        Driver driver1=new Driver("ID",petrol,days,rate);

        System.out.println("Fuel Cost = "+driver1.fuelCost()+" OMR");

        System.out.println("Weekly - Waged Driver Total Wage = "+driver1.weeklyWage()+" OMR");

        System.out.println("Monthly - Waged Driver Total Wage = "+driver1.monthlyWage(mAllowance)+" OMR");
    }
}
