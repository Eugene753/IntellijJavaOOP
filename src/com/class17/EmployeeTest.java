package com.class17;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		
		obj1.empID="123GHG";
		obj1.salary=120000;
		obj2.empID="456FGF";
		obj2.salary=125000;
		System.out.println("Employee ID :"+obj1.empID+"\nEmployee salary :"+obj1.salary+" \nCEO:"+Employee.CEO);
		System.out.println("Employee ID :"+obj2.empID+"\nEmployee salary :"+obj2.salary+" \nCEO:"+Employee.CEO);
		
		
		

	}

}
