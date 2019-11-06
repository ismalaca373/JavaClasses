package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class C_ScannerClass {
	

	public static void main (String[] args) {
												// scanner is a class in java let user put data. scanner will help us to make
												// our program more interactive

												// (system.in) user ne girerse buraya yazilmis oluyor
		Scanner temp = new Scanner(System.in); // Scanner is a class so start capital S
												//Scannerin alti cizilirse yukaradki yazi yoktur demek. ustune cift tiklayip yazdirabilirsin.
		System.out.println("please enter any number");
		
		
																					/*
																				 * nextInt(); --> numbers  kullanacaksan
																				 * nextLine();--> strings kullanacaksan
																				 * nextDouble();-- double
																				 * 
																				 */
		
		int num = temp.nextInt(); // scan. yazinca optinlar geliyor birini sec
		System.out.println("you entered " + num);
		
		//numarayi girdiginde entera basiyorsun run demiyorsun
		
		
		System.out.println("**************");
		
		Scanner input = new Scanner (System.in);   // bu hep yaziliyor
		System.out.println("please enter your name"); // buraya usera ne deyeceksen diyorsun
		String name= input.nextLine(); //bunlar data typ a gore degisiyor ve user ne yazarsa buraya konuyor
		
		System.out.println("Good afternoon "+ name); //sonra bu yaziliyor
		
		
		

	}
	

}
