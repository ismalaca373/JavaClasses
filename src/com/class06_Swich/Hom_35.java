package com.class06_Swich;

import java.util.Scanner;

public class Hom_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*For you to do:
Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
and make the comparisons:
if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you need a loan?");

		boolean result = scan.nextBoolean();
		
		String eligible;
		
		if (!result) {
			System.out.println("The eligibility is Unknown");

		} else {
			System.out.println("What is your credit score?");

			int score = scan.nextInt();
			
			
			if (score < 600) {
			
				eligible = " Not eligible";

			} else if (score >= 600 && score <= 700) {
					
				eligible = "Maybe eligible";

			} else if (score > 700 && score <= 800) {
				
				eligible = "Eligible";
			} else {
				
				eligible = "Definitly Eligible";
		}
	
	        System.out.println("The eligibilty is " + eligible);
	}
		
		///second way
		
		Scanner scan1;
		boolean loan;
		int creditScore;
		String eligibility;

		scan1 = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		loan = scan1.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			creditScore = scan1.nextInt();
			
			if (creditScore < 600) {
				eligibility = "Not eligible";
			} else if (creditScore >=600 && creditScore <= 700) {
				eligibility = "Maybe eligible";
			} else if (creditScore >=701 && creditScore <=800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}
		} else {
			eligibility = "Unknown";
		}
		System.out.println("The eligibility is " + eligibility);
	}


		
		
		
}

