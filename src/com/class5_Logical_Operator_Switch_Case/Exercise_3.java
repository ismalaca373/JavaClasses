package com.class5_Logical_Operator_Switch_Case;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		/*
		 * ask user to enter value for sale goin on or not if there is no sale - iamnot
		 * shoping if sale check the price of the item based on the eamount wi will have
		 * to calculate the price after discount if price <20 -> apply 10% if price
		 * between 20-100 _> 20% if between 100-500_> 30% anyting else i will give _>
		 * 50%
		 * 
		 * after discount _____ the price of the item reduce from ___ to __
		 */

		Scanner inp = new Scanner(System.in);

		System.out.println("Is there any sale today");

		boolean sale = inp.nextBoolean();

		double price;
		double discount;
		double finalPrice;

		if (!sale) {
			System.out.println("Iam not shopping");
		} else {
			System.out.println("Wha tis the accual price");

			price = inp.nextDouble();

			if (price < 20) {

				discount = price * 0.10;

			} else if (price > 20 && price < 100) {

				discount = price * 0.20;

			} else if (price >= 100 && price < 500) {

				discount = price * 0.30;
			} else {
				discount = price * 0.50;

			}

			finalPrice = price - discount;

			System.out.println("After discount " + discount + " the price of the item reduce from " + price + " to " + finalPrice);

//	if (sale) {
//		
//		System.out.println("Check the price of the item");
//		
//		double price = scan.nextDouble();
//		double finalPrice = price-dis;
//		double dis;
//		if (price<20) {
//			
//			price=finalPrice
//			
//		}else if (price>=20 && price<100) {
//			
//			System.out.println(price*0.2);
//		
//	}else if (price >=100 && price <=500) {
//		
//		System.out.println("price*0.3");
//	}else {
//		
//		System.out.println(price*0.5);
//				
//		
//	}
//		System.out.println("After discount "+ price + "the price of the item reduce from "+ price + );
//	
//		
//	
//	} else {
//		
//		System.out.println("I am not shopping");
//	
//	

		}
	}
}
