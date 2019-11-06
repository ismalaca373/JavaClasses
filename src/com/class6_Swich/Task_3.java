package com.class6_Swich;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 3.HomeWork: Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
 */
		
	Scanner scan = new Scanner (System.in);
	
	
	System.out.println("Enter first number");
	
	int num1 = scan.nextInt();
	
//	Scanner op = new Scanner (System.in);
	
	System.out.println("Enter operator");
	
	char oper = scan.next().charAt(0);
	
	
	System.out.println("Enter second number");
	
	int num2 = scan.nextInt();
	
	
	if (oper == '+') {   // string variable kullanirsan == yerine .equals() kullanmalisin
		
		System.out.println("your answer is " + (num1 + num2));
		
	}else if (oper == '-') {
		
		System.out.println("your answer is " + (num1 - num2));
		
	}else if (oper == '*') {
		
		System.out.println("your answer is " + (num1 * num2));
		
	}else if (oper == '/') {
		
		System.out.println("your answer is " + (num1 / num2));
		
	}
	
	}
}



