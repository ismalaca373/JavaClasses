package com.class25_Multi_Inheritance;

public class Employee { // test ve scrumtemle baglantili

	int salary; // acceble with in same package
	public static String companyName;
	
	protected int employeeId;   // paket icinde ve inheritancele baska pakette ulasablirsin
	private String employeeSsn; // accecsslbe from same class
	

	void work() {

		System.out.println("I work in " + companyName + " company");
	}

	void getPaid() {
		
		System.out.println("I get paid" + salary);
	}

}