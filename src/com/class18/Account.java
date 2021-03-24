package com.class18;

public class Account {

	private double accountAccountBalance;
	private String actualuserName;
	private String actualpassword;
	
	
	public boolean login(String enteredUserName, String enteredPasswrd) {
		 return enteredUserName.equals(actualuserName)&&enteredPasswrd.endsWith(enteredPasswrd); 
	}
	
	public boolean singUp(String enteredUserName, String enteredPasswrd,double enteredBalance) {
		if(enteredUserName.length()>15) {
			return false;
		}else {
		actualuserName=enteredUserName;
		actualpassword=enteredPasswrd;
		accountAccountBalance=enteredBalance;
		return true;
		}
	}
	
	
	
	boolean transferFunds(String Password,double enteredAccountBalance) {
		if(Password.equals(actualpassword)&&enteredAccountBalance<=accountAccountBalance){
			
			accountAccountBalance=accountAccountBalance-enteredAccountBalance;
			return true;
		}else {
			return false;
		}
	}
}
