package com.class6_Swich;

import java.util.Scanner;

public class Task_Scanner_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ask user where they are from based in the country we wil specify favorite
		 * food
		 * 
		 */

		String country, foodName;
		Scanner scan;

		System.out.println("Where are you from");

		scan = new Scanner(System.in);

		country = scan.nextLine();

		switch (country) {

		case "Turkey":
			foodName = "Kebab";
			break;

		case "Ethiopia":

			foodName = "Tibs";
			break;
		case "Morocco":

			foodName = "Tajin";
			break;
		case "Kzakhistan":
			foodName = "Kumis";
			break;
		case "Pakistan":
			foodName = " Beryani";
			break;

		case "Russia":
			foodName = "Caviar";
			break;

		default:
			foodName = "Unknown";

		}
		System.out.println("You are from " + country + " and your favorite food is " + foodName);
	}

}
