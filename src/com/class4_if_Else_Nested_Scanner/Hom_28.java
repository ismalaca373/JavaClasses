package com.class4_if_Else_Nested_Scanner;

import java.util.Scanner;

public class Hom_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * The variable "num" holds an integer user input Write a conditional statement
		 * starting on line 9 that does the following: If num is positive, print
		 * "__ is positive" If num is negative, print "__ is negative"
		 * 
		 */

		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	
	  	int a = inp.nextInt();
	  	
	  	if (a > 0) {

				System.out.println(a + " is positive");

			} else if(a<0) {
				
				System.out.println(a + " is negative");
			}else { 
				
				System.out.println(" ");
			}
		
	  	

	}

}
