package com.class17;

public class LocalVarsUse {
	
		double salary=1200000;
		void printInfo() {
			String name="Asgahr";
		}
	
		void printSalaryPlusBonus() {
			double bonus=50000;
			System.out.println(salary+bonus);
		}

	public static void main(String[] args) {
		
		LocalVarsUse obj=new LocalVarsUse();
		obj.printInfo();
		obj.printSalaryPlusBonus();

	}

}
