package com.class_w3resource;

import java.util.Scanner;

public class Exercises_1_5 {

	// 1
	public static void main(String[] args) {
		
		/*
		 * Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
Expected Output :
Hello
Alexandra Abramov
		 */

		System.out.println("Hello");

		System.out.println("Samuel");

		System.out.println("***********");

		// you can do

		System.out.println("Hello\nSamuel"); // \n bunu yaznca ikinci line yaziyor

		System.out.println("***********");

		// 2
		/*Write a Java program to print the sum of two numbers.
		 */

		System.out.println(74 + 36); //en basit yazimi

		System.out.println("***********");

		int num = 74;
		int num2 = 36;

		int data = num + num2;

		System.out.println(data);

		System.out.println("***********");
		
		//3
		/*Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
		 */
		System.out.println(50/3); //16 verdi cunku yuvarliyor
		
		System.out.println("***********");
		
		int no = 15;
		int no1 = 3;
		System.out.println(no/no1);
		
		
		
		//4
		/*Write a Java program to print the result of the following operations. Go to the editor
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
		 */
		
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println(20+-3*5/8);
		System.out.println(5+15/3*2-8%3);
		
		System.out.println("***********");
		
		//or 
		
		int a = -5+8*6;
		int b = (55+9)%9;
		int c = 20+-3*5/8;
		int d = 5+15/3*2-8%3;
		
		System.out.println(a+"\n"+ b+"\n"+ c+ "\n"+ d);
		
		System.out.println("***********");
				
		//5
		/*Write a Java program that takes two numbers as input and display the product of two numbers. * multiplay
		 * 
		 */    
		
		int x= 15;  //easy way
		int y=5;
		
		int product= x*y;
		
		System.out.println(product);
		
		System.out.println("***********");
		
		//scannerla yapabilirsin cunku program takes 2 input diyor
		
		Scanner ali = new Scanner(System.in);
		
		System.out.println("Please write one number");
		
		int sayi = ali.nextInt();
		
		System.out.println("Please input second number");
		
		int sayi1 = ali.nextInt();
		
		int carpma = sayi*sayi1;
		
		System.out.println(carpma);
		
		
		
		
		
	}
}
