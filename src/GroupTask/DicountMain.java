package GroupTask;

import java.util.Scanner;

class DiscountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input brand and model of the cellphone: ");
		String model = scn.nextLine();
		System.out.print("Input number of items: ");
		int numOfItems = scn.nextInt();
		System.out.print("Input the price: ");
		double price = scn.nextDouble();

		Discount d1 = new Discount(model, numOfItems, price);
		System.out.println("Replaced phone details: " + model.replaceAll("a", "A"));
		System.out.println("Company code: " + d1.companyCode(model));
		System.out.println("Your discount is: $" + d1.discount());
		System.out.println("Your total is: $" + d1.total());

	}

}

