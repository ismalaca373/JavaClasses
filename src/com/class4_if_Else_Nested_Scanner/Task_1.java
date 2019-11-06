package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

		/*
		 * 1. You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 * 
		 * 
		 * 
		 * 
		 * Create a Java program that will ask user to input temperature and city. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 * 
		 */
	//1.soru
		
		Scanner loan = new Scanner(System.in);

		System.out.println("What is the amount of loan is needed");

		int num = loan.nextInt();

		if (num >= 2000000) {

			System.out.println("you are approved");
		} else {

			System.out.println("you are rejected");

		}

		



/*
write a program a boolean value of whether user has diploma or not
* has a diploma, say conguralation
* otherwise say get a degree
* sonra gpa cehk et 3,5 dan buyukse eligible for scholarsh
* degilse degil
* 
* 
*/

boolean diploma = true; //false la dene

double gpa = 3;

if (diploma) {

	System.out.println("congratulations");

	if (gpa >= 3.5) {

		System.out.println("you are eligible for scholarship");
	} else {

		System.out.println("you should have studied harder");
	}

} else {

	System.out.println("you should get a degree");
}
System.out.println("****************");

/*create java prog
* store value f margage rate and morgage price
* 
* 
* 
* 
*/

double rate = 4.2;
int price = 100000;

if (rate>4.5) {
	
	System.out.println("not buy a house");
	
	
}else {
	
	System.out.println("buy");
	
if (price>200000) {
	System.out.println("take a loan");
	
	
}else {
	
	System.out.println("pay cash");
}
}
}

}
