package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Wed_Nested_if_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		/*
//		 * Verify if button is displayed on the page if button is displayed then we need
//		 * to verify text on if text equal to sign in --> Test case pass otherwise -->
//		 * Wrong text is displayed
//		 */
//		// i we have multiple condition use if nessted
//		boolean isDisplayed = true;
//
//		String buttonText = "Sign In";
//
//		if (isDisplayed) {
//
//			System.out.println("Button is displayed"); // bunu nokta gibi dusun
//
//			if (buttonText.equals("Sign In")) {
//
//				System.out.println("Test case pass");
//			} else {
//
//				System.out.println("Wrong text is displayed");
//			}
//		} else {
//
//			System.out.println("Button is not displayed");
////		}
////
////		/*
////		 * Create a Java program that will ask if user has a credit card or not. If you
////		 * user does not have a credit card then offer them. If they do have one ask
//		 * what is balance on the card? If balance of the card is larger than 1000, tell
//		 * them to pay off otherwise you can tell them that they can spend more
//		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Do you have a credit card? true or false");

		boolean cc = input.nextBoolean();

		if (cc == true) {   //bunun karsiligi dogru degilse yazilacak else den once yazilmali
			System.out.println("What is the balance on your card?");

			int balance = input.nextInt();

			if (balance > 1000) {
				System.out.println("Please pay off your balance");
				
			} else {
				System.out.println("You can spend more money");
			}
		} else {
			System.out.println("Would you like to apply for credit card");
		}
	}
}
