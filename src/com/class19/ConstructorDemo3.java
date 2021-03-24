package com.class19;

public class ConstructorDemo3 {
	
	String name;
	double salary;
	double bonus;
	int numberOfDaysWorked;
	double bonusPercentage;
	
	
	ConstructorDemo3(String name,double salary,int numberOfDaysWorked,double bonusPercentage){
		this.name=name;
		this.salary=salary;
		this.bonus=1000;
		this.numberOfDaysWorked=numberOfDaysWorked;
		this.bonusPercentage=bonusPercentage;
		
	}
	
	void printBonus() {
		
		if(numberOfDaysWorked>300) {
			
			bonus=1000;
			
		}else {
			bonus=500;
		}
	}

	public static void main(String[] args) {
		
		ConstructorDemo3 ramObj=new ConstructorDemo3("Ram",100000,301,100);
		ramObj.printBonus();
		System.out.println(ramObj.name);
		System.out.println(ramObj.salary);
		System.out.println(ramObj.bonus);
		System.out.println(ramObj.numberOfDaysWorked);
		System.out.println(ramObj.bonusPercentage);
		//ramObj.printBonus();

	}

}
