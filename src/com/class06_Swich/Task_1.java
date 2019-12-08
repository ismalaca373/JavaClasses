package com.class06_Swich;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 1. Ask user to enter their country and capture it.
		 * Once values are captured print which languageuser speaks.
		 * 
		 * 3.HomeWork: Using scanner class createcalculator. 
		 * Allow user to enter 2 numbers andoperator(+,-,*,/). 
		 * Based on operator provide theresult to user.
		 */
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your country");
		
		String count = scan.next();
		
		String language;
		
		switch (count) {
		
		case "Turkey":
			
			language = "Turkish";
			break;
			
		case "Russia":
			
			language = "Russian";
			break;
		
		case "Frence":
			
			language = "French";
			break;
			
		default:
			language = "Unknown";
		}
		
		System.out.println("People speaks "+ language+ " in "+ count);
		
		
	
		
		}

}


