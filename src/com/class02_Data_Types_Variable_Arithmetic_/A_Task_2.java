package com.class02_Data_Types_Variable_Arithmetic_;

public class A_Task_2 {

	public static void main(String [ ]args) {
		
		/*
		 * 
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. 
		 * “The _______ of 2 numbers ___ and ___ is equal to _____”
1. Write a program to find the square of the number 3.9. 
You program should say “The square of the ____ is ____ “
2.Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”

		 */
		
		//1.ci soru
		
		int num1, num2;
		
		num1 = 5;
		num2 = 10;		
				
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 +" is equal to " + sum );
		System.out.println("The sub of 2 numbers " + num1 + " and " + num2 + " is equel to " + sub );
		System.out.println("The mult of 2 numbers " + num1 + " and " + num2 + " is equel to " + mult );
		System.out.println("The div of 2 numbers " + num1 + " and " + num2 + " is equel to " + div );
		
		System.out.println( );
		
		// 2.soru
		
		double num4;
		num4 = 3.9;
		
		
		double square2 = num4 * num4;
		

		System.out.println("The square of the " + num4 + " is " + square2);
		
		
		// 3 uncu soru
		
		int witdh, height;
		
		witdh= 5;
		height= 8;
		
		int perimeter= (witdh+height)*2;
		int area = witdh*height;
	
		System.out.println("Te perimeter of a rectangle with " + witdh + " and height " + height + 
				" is equal to " + perimeter + " and the area is " + area );
		
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
