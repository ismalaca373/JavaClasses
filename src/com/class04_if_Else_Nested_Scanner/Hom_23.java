package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that takes user's first name and surname. First input:
		 * "Please Enter First Name" should print first input. Second
		 * input:"Please Enter Surname" should print second input.
		 * 
		 * Final Output: Print both first name and surname on one line. Make sure there
		 * is a space between First Name and Surname.
		 * 
		 */
		Scanner age = new Scanner(System.in);

		System.out.println("Enter your age");

		int a = age.nextInt();

		a += 10;
		
		System.out.println("Your age after 10 years is "+ a);
		
		//second way
		
		Scanner in = new Scanner(System.in);
		  System.out.print("Enter your age  ");
		  int age2 = in .nextInt();
		  System.out.println("your age after 10 years is " + (age2 + 10));

	}

}
