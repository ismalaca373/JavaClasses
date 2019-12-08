package com.class04_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Practice_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		// ask user to enter 2 number then compare which is larger
		System.out.println("please neter first number");
		int num1 = keyboard.nextInt();
		System.out.println("please enter second number");
		int num2 = keyboard.nextInt();

		if (num1 > num2) {

			System.out.println(num1 + " is larger than " + num2);
			
		}else if (num1==num2) {
			
			System.out.println(num1 + " equal " + num2);

		} else {

			System.out.println(num1 + " is samllar then  " + num2);

		}
	}

}
