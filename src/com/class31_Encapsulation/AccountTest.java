package com.class31_Encapsulation;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.setAccountNumber(12345678);
		long accountNum=acc.getAccountNumber();
		System.out.println(accountNum);
		
		acc.setBalance(-200);
		double myBalance=acc.getBalance();
		System.out.println(myBalance);
		
		
		int num=123;
		String.valueOf(num); //converts given value to String
	}
}
