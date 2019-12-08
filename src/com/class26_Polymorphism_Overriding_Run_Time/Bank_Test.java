package com.class26_Polymorphism_Overriding_Run_Time;

public class Bank_Test {

	public static void main(String[] args) {
		

		Bank bank = new Bank();
		
		bank.money = 900;
		
		double fee = bank.chargeFee();
		
		System.out.println("Bank fee is "+ fee);
	
		
		PNC pnc  = new PNC();
		
		pnc.money=900;
		
		double pncFee = bank.chargeFee();
		
		
		System.out.println("PNC fee is " + pncFee);
		
		
		
	}

}
