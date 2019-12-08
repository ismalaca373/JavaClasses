package com.class06_Swich;

import java.util.Scanner;

public class Hom_42 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program using the switch statement  
Let us consider there are three students in the class with roll number  starting from (101 to 103) if any number other than 101-103 are present display "Not found Student name: in Class"

First Output: "enter the roll number of the Child"

case 101: if roll number is 101 print as "Student name: Ramesh "

case 102 :if roll number is 102 print as "Student name: Mahesh "

case 103:if roll number is 103 print as "Student name: Mukesh "

Other than this roll number  it should print "Not found Student name: in Class"

		 * 
		 */
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number between 1-12");
		
		int num	= scan.nextInt();
		
		String month;
		
		
		switch (num) {
			
			case 1:
				
				month = "January";
				break;
			case 2:
				
				month = "February";
				break;
			case 3: 
				
				month = "March";
				break;
			case 4:
			
				month = "April";
				break;
			case 5:
				
				month = "May";
				break;
			case 6: 
				
				month = "June";
				break;
			case 7:
				
				month = "July";
				break;
			case 8:
				
				month = "August";
				break;
			case 9: 
				
				month = "September";
				break;
			case 10:
			
				month = "October";
				break;
			case 11:
				
				month = "November";
				break;
			case 12: 
				
				month = "December";
				break;
			default:
				
				month = "Invalid";	
			
		}
		
	System.out.println(month);
		
	}

}

/* diger yolu
 * 
 * case 1: 
				System.out.println("January");
				break;
			case 2: 
				System.out.println("February");
				break;
			case 3: 
				System.out.println("March");
				break;
			case 4: 
				System.out.println("April");
				break;
			case 5: */

