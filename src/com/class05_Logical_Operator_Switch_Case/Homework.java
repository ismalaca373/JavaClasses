package com.class05_Logical_Operator_Switch_Case;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F


Write a program to determine the classMode.
If there is no rain → classMode=“In Class”, otherwise classMode → “Online”.

		 */
		  
		
//		
//		int quiz = 10;
//		
//		int mid = 30;
//		
//		int fin = 50;
//		
//		double ave = (quiz+mid+fin)/3;
//		
		Scanner scan1= new Scanner(System.in);
		
		
		System.out.println("Please enter quiz grade");
		int quiz=scan1.nextInt();
		System.out.println("Please enter quiz grade");
		int mid=scan1.nextInt();
		System.out.println("Please enter quiz grade");
		int fin=scan1.nextInt();
		
		double ave= (quiz+mid+fin)/3;
		
	if (ave>=90) {
		
		System.out.println("A");
		
	}else if (ave>=70 && ave<90) {
		
		System.out.println("B");
	}else if (ave>=50 && ave<70) {
		
		System.out.println("C");
	}else if (ave<50) {
		System.out.println("F");
	}else {
		System.out.println("noooo");
	}
	
	}
}
		
//		
//		double quiz= 50;
//		
//		double mid= 50;
//		double fin= 30;
//		
//		double average = ((quiz+mid+fin)/3);
//		
//		
//		
//		if (average >=90) {
//			
//			System.out.println("Grade is A");
//			
//			
//		}else if (average >=70 && average<90) {
//			
//			
//			System.out.println("Grade is B");
//			
//		}else if (average >=50 && average<70) {
//	
//			System.out.println("Grade is C");
//	}else {
//		
//		System.out.println("Grade is F");
//	}

