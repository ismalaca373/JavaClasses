package com.class6_Swich;

import java.util.Scanner;

public class B_Swich_And_Scanner {

	public static void main(String[] args) {
		
		/*
		 * ask user to enter their gender f or m
		 * if f _> Femal
		 * if M_> male
		 * otherwise_> unknow
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your gender: F or M");
		
		char gender=scan.next().charAt(0);
		
		String userGender;
		
		switch (gender) {
		
		case 'M': 
			userGender = "Male";
			break;
			
		case 'F':
		userGender = "Female";
		break;
			
		default:
			userGender = "Unknown";
			
		}
		
		System.out.println("Your gender is "+userGender);

	}

}
