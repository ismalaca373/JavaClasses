package com.class18_Objective_Oriented_Parameters;

public class Baby {
	
	public static void main(String[]args) {
		
		Baby baby1 = new Baby();

		baby1.cry();

		baby1.firstName = "John";
		baby1.lastName = "Doe";
		baby1.gender = 'M';
		baby1.hairColor = "Yellow";
		baby1.weight = 7;

		System.out.println(baby1.firstName);

		System.out.println(baby1.gender);
		
		//////////////////////
		
		System.out.println(" ");

		baby1.walk(3);
		baby1.cry();
		baby1.talk();

		System.out.println("Done with baby one");
		

///////////////////////////////////////////////
		System.out.println(" ");
		
		Baby baby2 = new Baby();

		baby2.firstName = "Ann";
		baby2.lastName = "Smith";
		baby2.hairColor = "Blue";
		baby2.gender = 'F';
		baby2.weight = 6;

		baby2.cry();

		baby2.talk();
		
		baby2.walk(2);
		
		System.out.println("Full name of baby 2 " + baby2.firstName + " " + baby2.lastName);
		

		System.out.println("-----------------");
		baby1.displayBabyInfo();
		baby2.displayBabyInfo();
	}
	
////////////////////////////// burdan asagisi main disinda classin icinde

	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;

	void talk() {
		System.out.println("Bla bla bla");
	}

	void walk(int times) {
		for (int i = 1; i <= times; i++) {
			System.out.println("Crawl");
		}
	}

	void cry() {
		System.out.println("Cry every minute");
	}
	
	void displayBabyInfo() {
		
	
		System.out.println("Full name is: " + firstName + " " + lastName);

		System.out.print("Gender is: ");
		
		System.out.println("Hair color is: " + hairColor);
		
		if (gender == 'M') {
			System.out.println("Boy");
		} else if (gender == 'F') {
			System.out.println("Girl");
		} else {
			System.out.println("Unknown");
		}

		
	
	}
	
	
	
	}
	



