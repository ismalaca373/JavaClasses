package com.class5_Logical_Operator_Switch_Case;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		/*
		 * ask user to enter daily sales based on salse range we want to give commision
		 * to the persson if sales is <100 --> commision is %10 if sale is between
		 * 100-200 --> %20 etc..
		 * 
		 * 
		 * 
		 * 
		 */
		

		Scanner scan;
		double salesAmount;
		double commisson;

		scan = new Scanner(System.in);

		System.out.println("enter your sales amount");

		salesAmount = scan.nextDouble();

		if (salesAmount < 100) {

			commisson = salesAmount * 0.1; // lets give user 10% commision of a sale

		} else if (salesAmount >= 100 && salesAmount < 200) {

			commisson = salesAmount * 0.2;
			
		} else if (salesAmount >= 200 && salesAmount < 500) {
			
			commisson = salesAmount * 0.3;

		} else if (salesAmount >= 500) {

			commisson = salesAmount * 0.5;
			
		} else {
			
			commisson = 0;
		}

		System.out.println("based on the sell you commusion is " + commisson);
	}

}
