package com.class5_Logical_Operator_Switch_Case;

import java.util.Scanner;

public class Task_2 {

	public static void main (String[]args) {
		
		/*
		 * prompt the user to enter person heights in feet. person should be classified as one of the following:
		 * short (under 5 feet)
		 * medium (5 to 6)
		 * tall (6 feet and over)
		 */
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter your heigh in feet");
		
		int heightinch = a.nextInt();
		
		
		if(heightinch>=1 && heightinch <=5 ) {
		
		System.out.println("you are short");
		
		
	}else if(heightinch>5 && heightinch<=7) {

	System.out.println("you are medium");

	}else{

		System.out.println("you are tall");
}
		}
		}

