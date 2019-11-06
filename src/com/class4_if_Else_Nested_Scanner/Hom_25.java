package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_25 {

	public static void main(String[] args) {

		/*
		 * Create a Scanner class
		 * 
		 * Create a program that will take a boolean value from a user. If the input is
		 * True or False, then the output should look like below:
		 * 
		 * First Output: "Input the boolean value"
		 * 
		 * Final Output: "The value is ______"
		 */

		boolean bool1;
		Scanner in= new Scanner(System.in);
		System.out.println("Input boolean value");
		bool1= in.nextBoolean();
		System.out.println("The value is "+bool1);
		
		//second way
		
		Scanner s1 = new Scanner(System.in);
	    System.out.println("Input the boolean value");
	    
			boolean hello=s1.nextBoolean();
	   
	      if(hello){
	        System.out.println("The value is "+hello);
	      }else{
	         System.out.println("The value is "+hello);
		
	}
	
	}}

