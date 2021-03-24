package com.class18;

public class TypesOfvars {

	String name;
	static String CompanyName="Syntax";
	
	void printInfo() {
		System.out.println(name+" Company "+CompanyName);
	}
	static void PrintCompanyInfo() {
		//System.out.println(name);
		System.out.println(CompanyName);
	}
	
	public static void main(String[] args) {
		
		TypesOfvars obj1=new TypesOfvars();
		obj1.name="Ram";
		
		TypesOfvars obj2=new TypesOfvars();
		obj2.name="Aiman";
		
		TypesOfvars.PrintCompanyInfo();

	}

}
