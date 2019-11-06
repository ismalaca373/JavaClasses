package com.class6_Swich;

public class Wed_Exer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Task 2
//		/ Write a program to found out the user level of experience 
				        // Must use a switch statement with  a String variable named levelString and a int variable named level 
				        // Beginner level should be 1
				        // Intermediate level should be 2
				        // Expert level should be 3
		
		
		String levelString;
		
		int level= 5;
				
		switch (level) {
		
		
		case 1:
			
			levelString = ("Beginner Level");
		break;
		
		case 2:
			
			levelString = ("Intermediate Level");
		break;
		
		case 3:
			
			levelString = ("Expert Level");
		
		break;
		
		default:										//default yazmayinca asagida vermiyor
			
			levelString = ("iyi-kotu");
			
		
		}
		
		System.out.println(levelString);  //l
	}
}

