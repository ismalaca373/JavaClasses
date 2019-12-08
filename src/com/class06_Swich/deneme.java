package com.class06_Swich;
import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *ask user to enter daily sales based on salse range we want to give commissionmision
		 * to the persson if sales is <100 --> commissionmision is %10 if sale is between
		 * 100-200 --> %20 etc..
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your daily sale");
		
		double boo = scan.nextDouble();
		double commission;
		
		if (boo<100) {
			
			commission = boo*0.1;
			
		}else if (boo>=100 && boo<=200) {
		
		commission= boo*0.2;
		
		}else if (boo>200 && boo<=500) {
			
			commission = boo*0.4;
		}else {
			commission = 0;
			
		}
		
		System.out.println("Your sale is "+ boo +" end your commissionmision is "+ commission);
}
}