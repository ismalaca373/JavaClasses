package com.class06_Swich;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2.Allow user to enter grade and then provideexplanation: 
//			 * A-Excellent, B-Good, C-Average,D-Bad, any other grade --> Not Acceptable. 
//			 * At theend your program should print which grade wasentered by a user with explanation.
//			 * 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		
		char grade = scan.next().charAt(0);
		
		String a;
		
		switch (grade) {
		
		case 'A':
			
			a = "Excellent";
			break;
			
		case 'B':
			
			a = "Good";
			break;
			
		case 'C':
			
			a = "Average";
			break;
			
		case 'D':
			
			a = "Bad";
			break;
			
		default:
			
			a = "Not Acceptable";
			
		
		}
		
		System.out.println("Your grade is "+ grade + " and you are "+ a);
	}

}
