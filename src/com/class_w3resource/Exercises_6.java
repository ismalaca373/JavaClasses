package com.class_w3resource;

import java.util.Scanner;

public class Exercises_6 {

	public static void main(String[] args) {

		/*
//		 * Write a Java program to print the sum (addition), multiply, subtract, divide
//		 * and remainder of two numbers. Go to the editor Test Data: Input first number:
//		 * 125 Input second number: 24 Expected Output : 125 + 24 = 149 125 - 24 = 101
//		 * 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5
//		 * 
//		 */
//
//		int num = 20; // this is kolay yolu eger user numbrlari verisn diyorsan Scannerla
//						// yapanbilirsin
//		int num3 = 4;
//
//		int sum = num + num3;
//		int mult = num * num3;
//		int sub = num - num3;
//		int div = num / num3;
//		int mod = num % num3;
//
//		System.out.println(sum + "\n" + mult + "\n" + sub + "\n" + div + "\n" + mod);
//
//		System.out.println("***********");
//		
		///////////////////////////////////////////

		Scanner in = new Scanner(System.in);

		System.out.print("Input first number: ");
		int num1 = in.nextInt();

		System.out.print("Input second number: ");
		int num2 = in.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); //yukardaki gibi declare yapip print de yapabilirsin

		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
	}

}
