package com.class06_Swich;

import java.util.Scanner;

public class Hom_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prompt user with questions: "Please enter your favorite car make"

if user enters  BMW -->  carOrigin = "german car"
if user enters  Toyota -->  carOrigin = " japanese car"
if user enters  Maserati -->  carOrigin = "italian car"
anything else besides those values --> carOrigin = "unknown" 
 
The output of your program should be:
"Your favorite car is ___"
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your favorite car make");
		
		String make = scan.nextLine();
		
		String carOrigin;
		
		
		switch (make) {
		
		
		case "BMW":
			
			carOrigin = "german car";
			break;
			
		case "Toyota":
			
			carOrigin = "japanese car";
			break;
			
		case "Maserati":
			
			carOrigin = "italian car";
			break;
		
		default:
			
			carOrigin = "unknown";
			
		}
		
		System.out.println("Your favorite car is " +carOrigin);
	}

}
