package com.class3_If_else;

public class Ex_2_if_else {

	public static void main(String []args ) {
		
	/*
	 * 
	 * Creat a java program and declare int variable that will hold a mont. 
	 * based on the value o the variable your program should print the name of the month
	 */
		
		int month = 14;

		if (month == 1) {

			System.out.println("Jan");

		} else if (month == 2) {

			System.out.println("Feb");

		} else if (month == 3) {
			System.out.println("March");

		} else if (month == 4) {
			System.out.println("Apr");

		} else if (month == 5) {

			System.out.println("May");

		} else if (month == 6) {
			System.out.println("June");

		} else if (month == 7) {
			System.out.println("july");

		} else if (month == 8) {

			System.out.println("Aug");

		} else if (month == 9) {

			System.out.println("Sep");

		} else if (month == 10) {

			System.out.println("Oct");

		} else if (month == 11) {

			System.out.println("Now");

		} else if (month == 12) {

			System.out.println("Dec");

		} else
			System.out.println("I dont know");
			
		System.out.println("***********************");

		// write a program to check whether number is pozitive or negative

		int weat = 3;

		if (weat > 0) {

			System.out.println("It is pozitive");

		} else {

			System.out.println("it is negative");
		}

		System.out.println("***********************");

		// write a java program to check wether number is even or odd

		int check = 7; //// interview questin bu

		if (check % 2 == 0) { // %-reminder

			System.out.println("even");
		} else {
			System.out.println("odd");

		}

		System.out.println("***********************");          //interviev questions
		
		int i=137;
		if (i%2==0) { /// diger yolu da if (i%2!=0)  esit degilse != diyorsun
			
			System.out.println(i+ " is an even number");
			
		}else {
			System.out.println(i+" is ann odd number");
			
		}
		
		
}

	
	
}
