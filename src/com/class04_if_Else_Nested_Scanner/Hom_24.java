package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Must use the Scanner Class For you to do: Write a program to take user name,
		 * age and mobile number in single line.
		 * 
		 * First Output: "Enter your name" Second Output: "Enter your mobile number"
		 * Third Output: "Enter your age"
		 * 
		 * Final Output:
		 * "Your name is ___ , your age is ___ and your mobile number is (___)-___-____"
		 * 
		 * 
		 * 
		 */

		Scanner info = new Scanner(System.in);

		System.out.println("Enter your name");

		String first = info.nextLine();

		System.out.println("Enter your mobile number");

		String tel = info.nextLine();

		System.out.println("Enter your age");

		int age = info.nextInt();

		System.out.println("Your name is " + first + ", your age is " + age + " and your mobile number is " + tel);

	}

}
