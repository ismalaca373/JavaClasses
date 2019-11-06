package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Create a Java program that will ask user to input temperature and city. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 * 
		 * 
		 */

		Scanner temp = new Scanner(System.in);
		
		System.out.println("Please enter city name");
		
		String city = temp.nextLine();
  

		System.out.println("Please enter temperature");

	
		int fah = temp.nextInt();

		int cel = (fah - 32) * 5 / 9;

		System.out.println("The temperature in the city is " + cel);

	}

}
