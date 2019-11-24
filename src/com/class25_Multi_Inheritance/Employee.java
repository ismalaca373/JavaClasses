package com.class25_Multi_Inheritance;

public class Employee { test ve scrumtemle baglantili

	int salary;
	static String companyName;

	void work() {

		System.out.println("I work in " + companyName + " company");
	}

	void getPaid() {
		
		System.out.println("I get paid" + salary);
	}

}